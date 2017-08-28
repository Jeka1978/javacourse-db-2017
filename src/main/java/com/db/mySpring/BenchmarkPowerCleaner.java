package com.db.mySpring;

/**
 * Created by Evegeny on 28/08/2017.
 */
public class BenchmarkPowerCleaner implements Cleaner {

    @InjectByType
    private PowerCleaner powerCleaner;

    @Override
    public void clean() {
        long start = System.nanoTime();
        powerCleaner.clean();
        long end = System.nanoTime();
        System.out.println("clean time: " +(end-start));
    }
}
