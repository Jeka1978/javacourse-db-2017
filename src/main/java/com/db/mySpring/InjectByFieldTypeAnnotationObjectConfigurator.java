package com.db.mySpring;

import lombok.SneakyThrows;
import org.reflections.ReflectionUtils;

import java.lang.reflect.*;
import java.util.*;

/**
 * Created by Evegeny on 28/08/2017.
 */
public class InjectByFieldTypeAnnotationObjectConfigurator implements ObjectConfigurator {
    @Override
    @SneakyThrows
    public void configure(Object t) {
        Class<?> type = t.getClass();
        handleFields(t, type);

        handleMethods(t, type);


    }

    private void handleMethods(Object t, Class<?> type) throws IllegalAccessException, InvocationTargetException {
        Set<Method> methods = ReflectionUtils.getAllMethods(type, method -> method.isAnnotationPresent(InjectByType.class));


        for (Method method : methods) {
            Class<?> typeToInject = method.getParameterTypes()[0];
            Object object = ObjectFactory.getInstance().createObject(typeToInject);
            method.setAccessible(true);
            method.invoke(t, object);
        }
    }

    private void handleFields(Object t, Class<?> type) throws IllegalAccessException {
        Set<Field> fields = ReflectionUtils.getAllFields(type);
        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectByType.class)) {
                if (isCollections(field)) {
                    ParameterizedType genericType = (ParameterizedType) field.getGenericType();
                    Class<?> typeOfObjectsToInject = (Class<?>) genericType.getActualTypeArguments()[0];
                    Set<Class<?>> classes = (Set<Class<?>>) ObjectFactory.getInstance().getScanner().getSubTypesOf(typeOfObjectsToInject);
                    ArrayList arrayList = new ArrayList();
                    for (Class<?> aClass : classes) {
                        arrayList.add(ObjectFactory.getInstance().createObject(aClass));
                    }
                    field.setAccessible(true);
                    field.set(t,arrayList);
                } else {

                    Object o = ObjectFactory.getInstance().createObject(field.getType());
                    field.setAccessible(true);
                    field.set(t, o);
                }
            }
        }
    }

    private boolean isCollections(Field field) {
        return Arrays.asList(field.getType().getInterfaces()).contains(Collection.class);
    }
}
















