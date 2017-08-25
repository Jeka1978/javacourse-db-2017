package com.db.reflections;

import com.db.heroes.Elf;

import java.lang.reflect.*;
import java.util.stream.Stream;

/**
 * Created by Evegeny on 25/08/2017.
 */
public class ReflectionUtil {


    public static void printMethods(Class type) {

        if (type.isInterface()) {

        }

    }

    public static void printMethods(Object o) throws InvocationTargetException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InstantiationException {



        Class<?> type = o.getClass();

        Field[] declaredFields = type.getDeclaredFields();
        for (Field declaredField : declaredFields) {
          /*  declaredField.setAccessible(true);
            declaredField.set(o,12);*/
        }



        type.newInstance();

        Constructor<?>[] constructors = type.getConstructors();
        for (Constructor<?> constructor : constructors) {

        }

        while (type != null) {
            Method[] declaredMethods = type.getDeclaredMethods();
            for (Method declaredMethod : declaredMethods) {
               /* declaredMethod.setAccessible(true);
                declaredMethod.invoke(o);*/
                System.out.println(declaredMethod);
                if (!Modifier.isAbstract(declaredMethod.getModifiers())) {
                    System.out.println();
                }

            }
            type = type.getSuperclass();
        }

    }
}
