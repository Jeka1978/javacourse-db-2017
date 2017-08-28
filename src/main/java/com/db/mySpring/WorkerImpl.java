package com.db.mySpring;

/**
 * Created by Evegeny on 28/08/2017.
 */
public class WorkerImpl implements Worker {
    @Override
    public void work() {
        System.out.println("Working....");
    }

    @Override
    @Benchmark
    public void drinkBeer() {
        System.out.println("Пиво вкуснее чем работа!!!");
    }
}
