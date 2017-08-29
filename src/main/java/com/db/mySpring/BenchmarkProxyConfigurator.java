package com.db.mySpring;

import net.sf.cglib.proxy.Enhancer;
import org.reflections.ReflectionUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Evegeny on 28/08/2017.
 */
public class BenchmarkProxyConfigurator implements ProxyConfigurator {
    private BenchmarkController controller = new BenchmarkController();

    @Override
    public <T, E extends T> E wrapWithProxyIfNeeded(T t, Class<T> type) {
        if (type.isAnnotationPresent(Benchmark.class)) {
            if (type.getInterfaces().length == 0) {
                return (E) Enhancer.create(type, new net.sf.cglib.proxy.InvocationHandler() {
                    @Override
                    public Object invoke(Object o, Method method, Object[] args) throws Throwable {
                        return invokeWithBenchmark(method, args, t);
                    }
                });
            }
            return (E) Proxy.newProxyInstance(type.getClassLoader(), type.getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    return invokeWithBenchmark(method, args, t);
                }
            });
        }

        if (ReflectionUtils.getAllMethods(type).stream().anyMatch(method -> method.isAnnotationPresent(Benchmark.class))) {
            return (E) Proxy.newProxyInstance(type.getClassLoader(), type.getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    Method classMethod = type.getMethod(method.getName(), method.getParameterTypes());
                    if (classMethod.isAnnotationPresent(Benchmark.class)) {
                        return invokeWithBenchmark(method, args, t);
                    }
                    return method.invoke(t, args);
                }
            });
        }
        return (E) t;

    }

    private <T> Object invokeWithBenchmark(Method method, Object[] args, T t) throws IllegalAccessException, InvocationTargetException {
        if (controller.isEnabled()) {
            System.out.println("************START BENCHMARK for method " + method.getName() + " *********************");
            long start = System.nanoTime();
            Object retVal = method.invoke(t, args);
            long end = System.nanoTime();
            System.out.println(end - start);
            System.out.println("************END BENCHMARK for method " + method.getName() + " *********************");
            return retVal;
        } else {
            return method.invoke(t, args);
        }
    }
}
