package com.db.gc;

import lombok.ToString;
import org.fluttercode.datafactory.impl.DataFactory;

import java.util.Random;

/**
 * Created by Evegeny on 22/08/2017.
 */
@ToString
public class DataObject {
    private StringBuilder sb;
    private StringBuilder sb2;
    private StringBuilder sb3;
    private StringBuilder sb4;
    private StringBuilder sb5;
    private Random random = new Random();
    private DataFactory dataFactory = new DataFactory();

    public DataObject() {
        sb = new StringBuilder(dataFactory.getEmailAddress() + Integer.toString(random.nextInt(100000)));
        sb2 = new StringBuilder(dataFactory.getEmailAddress() + Integer.toString(random.nextInt(100000)));
        sb3 = new StringBuilder(dataFactory.getEmailAddress() + Integer.toString(random.nextInt(100000)));
        sb4 = new StringBuilder(dataFactory.getEmailAddress() + Integer.toString(random.nextInt(100000)));
        sb5 = new StringBuilder(dataFactory.getEmailAddress() + Integer.toString(random.nextInt(100000)));

    }

   /* @Override
    protected void finalize() throws Throwable {
        System.out.println("Я СДОХ!!!");
    }*/
}






