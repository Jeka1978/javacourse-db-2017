package com.db.strategy;

import java.util.Arrays;

/**
 * Created by Evegeny on 25/08/2017.
 */
public class Son implements Mother, Father {

    @Override
    public void speak() {

        Arrays.asList("").forEach(System.out::println);

        Mother.super.speak();
        Father.super.speak();
    }
}
