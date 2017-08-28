package com.db.home_singleton;

import lombok.SneakyThrows;

/**
 * Created by Evegeny on 28/08/2017.
 */
public class NDSResolver2 {
    private static NDSResolver2 ourInstance = new NDSResolver2();

    public static NDSResolver2 getInstance() {
        return ourInstance;
    }

    private NDSResolver2() {
    }

    @SneakyThrows
    public double getNDS() {
        Thread.sleep(3000);
        return 0.175;

    }
}
