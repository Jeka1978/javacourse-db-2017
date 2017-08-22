package com.db.wrapper_classes;

import com.db.lombok_examples.Person;
import com.db.polymorphism.Cat;

/**
 * Created by Evegeny on 22/08/2017.
 */
public class Main {
    public static void main(String[] args) {



















        int x=12;

        double d;

        Integer a = 2;
        Integer b = 3;
        System.out.println(a+b);


        String str = Integer.toString(x);

        Object[] objects = new Object[10];
        objects[0] = new Cat();
        objects[1] = new Person();
        Integer integer = Integer.valueOf(3);
        objects[2] = integer;
    }
}
