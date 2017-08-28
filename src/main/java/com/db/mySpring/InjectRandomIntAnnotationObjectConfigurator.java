package com.db.mySpring;

import lombok.SneakyThrows;
import org.reflections.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.Random;
import java.util.Set;

/**
 * Created by Evegeny on 28/08/2017.
 */
public class InjectRandomIntAnnotationObjectConfigurator implements ObjectConfigurator {
    private Random random = new Random();

    @Override
    @SneakyThrows
    public void configure(Object t) {
        Class<?> type = t.getClass();
        Set<Field> fields = ReflectionUtils.getAllFields(type);
        for (Field field : fields) {
            InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
            if (annotation != null) {
                int min = annotation.min();
                int max = annotation.max();
                int value = min + random.nextInt(max - min + 1);
                field.setAccessible(true);
                field.setInt(t, value);
            }
        }
    }
}








