package com.db.mySpring;

/**
 * Created by Evegeny on 28/08/2017.
 */
public interface ProxyConfigurator {
    <T, E extends T> E wrapWithProxy(T o);
}
