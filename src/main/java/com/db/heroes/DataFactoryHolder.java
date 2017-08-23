package com.db.heroes;

import lombok.Getter;
import org.fluttercode.datafactory.impl.DataFactory;

/**
 * Created by Evegeny on 23/08/2017.
 */
public class DataFactoryHolder {
    private static DataFactoryHolder ourInstance = new DataFactoryHolder();

    public static DataFactoryHolder getInstance() {
        return ourInstance;
    }

    @Getter
    private DataFactory dataFactory = new DataFactory();

    private DataFactoryHolder() {
    }
}
