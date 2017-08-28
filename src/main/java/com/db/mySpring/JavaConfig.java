package com.db.mySpring;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Evegeny on 28/08/2017.
 */
public class JavaConfig implements Config {

    private Map<Class, Class> ifc2Class = new HashMap<>();


    public JavaConfig() {
        ifc2Class.put(Speaker.class, ConsoleSpeaker.class);
        ifc2Class.put(Cleaner.class, PowerCleaner.class);


    }

    @Override
    public <T> Class<T> getImplClass(Class<T> type) {
        return ifc2Class.get(type);
    }
}












