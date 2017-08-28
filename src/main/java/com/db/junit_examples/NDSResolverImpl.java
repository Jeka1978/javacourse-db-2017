package com.db.junit_examples;

import lombok.SneakyThrows;

/**
 * Created by Evegeny on 28/08/2017.
 */
public class NDSResolverImpl implements NDSResolver {
    @Override
    @SneakyThrows
    public double getNDS() {
        Thread.sleep(3000);
        return 0.17;
    }

    @Override
    public double getMaam(int x) {
        return 0;
    }

    @Override
    public double getVAT() {
        return 0;
    }
}
