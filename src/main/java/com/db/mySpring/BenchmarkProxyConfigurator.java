package com.db.mySpring;

import org.springframework.core.annotation.Order;

/**
 * Created by Evegeny on 28/08/2017.
 */
public class BenchmarkProxyConfigurator implements ProxyConfigurator {
    @Override
    public <T, E extends T> E wrapWithProxy(T o) {
        return null;
    }
}
