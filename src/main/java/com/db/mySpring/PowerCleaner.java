package com.db.mySpring;

import javax.annotation.PostConstruct;

/**
 * Created by Evegeny on 28/08/2017.
 */
public class PowerCleaner implements Cleaner {
    @InjectRandomInt(min = 3, max = 8)
    private int repeat;

    @PostConstruct
    public void init () {
        System.out.println("repeat = " + repeat);
    }

    @Override
    @Benchmark
    public void clean() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("FFFFFFFFFFFFFFFFFFFFFFffffffffff");
        }
        throw new RuntimeException("УРААААААААААААААААААААААААА!!!!!!!!!!!!!!!");
    }
}
