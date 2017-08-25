package com.db.tdd;

import lombok.SneakyThrows;

import java.lang.reflect.Method;

/**
 * Created by Evegeny on 25/08/2017.
 */
public class TestRunner {
    @SneakyThrows
    public void runAllTestMethods(Object o) {
        Class<?> type = o.getClass();
        Method[] methods = type.getDeclaredMethods();
        for (Method method : methods) {
            RunThisMethod annotation = method.getAnnotation(RunThisMethod.class);
            if (annotation != null) {
                int repeat = annotation.repeat();
                for (int i = 0; i < repeat; i++) {

                    method.invoke(o);
                }
            }

        }
    }
}
