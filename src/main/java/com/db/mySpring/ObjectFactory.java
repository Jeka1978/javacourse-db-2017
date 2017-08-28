package com.db.mySpring;

/**
 * Created by Evegeny on 28/08/2017.
 */
public class ObjectFactory {
    private static ObjectFactory ourInstance = new ObjectFactory();

    public static ObjectFactory getInstance() {
        return ourInstance;
    }

    private ObjectFactory() {
    }

    public <T> T createObject(Class<T> type) {
        return null;
    }
}
