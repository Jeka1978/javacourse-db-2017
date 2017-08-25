package com.db.reflections;

import com.db.collections.Client;
import com.db.heroes.Elf;
import com.db.never_use_switch.MailGenerator;
import lombok.SneakyThrows;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by Evegeny on 25/08/2017.
 */
public class Main {


    @SneakyThrows
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {

        ReflectionUtil.printMethods(new Elf());
        ReflectionUtil.printMethods(MailGenerator.class);
    }
}
