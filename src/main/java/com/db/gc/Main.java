package com.db.gc;

import org.fluttercode.datafactory.impl.DataFactory;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Evegeny on 22/08/2017.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        String sss = "";

        StringBuilder sb = new StringBuilder();

        DataFactory dataFactory = new DataFactory();
        for (int i = 0; i < args.length; i++) {

            sb.append(dataFactory.getAddress());

        }
        sss = sb.toString();


        String s1 = "s1";
        String s2 = "s2";
        String s3 = "s3";
        String s4 = "s4";


        String s = s1 + s2 + s3 + s4;

        ArrayList<WeakReference<DataObject>> dataObjects = new ArrayList<>();
        Random random = new Random();


        while (true) {
            DataObject dataObject = new DataObject();

            if (random.nextInt(3) == 2) {
                dataObjects.add(new WeakReference<>(dataObject));
            }
            if (random.nextInt(1000000) == 666) {
                System.out.println(dataObject);
                System.out.println(dataObjects.size());
            }


        }
    }
}





