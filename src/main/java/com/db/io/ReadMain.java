package com.db.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

/**
 * Created by Evegeny on 21/08/2017.
 */
public class ReadMain {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("c:\\tmp\\human.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object o = ois.readObject();
        System.out.println(o);
    }
}
