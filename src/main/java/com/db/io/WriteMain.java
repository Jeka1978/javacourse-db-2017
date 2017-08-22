package com.db.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by Evegeny on 21/08/2017.
 */
public class WriteMain {
    public static void main(String[] args) throws IOException {
        Human ksysha = new Human("Ksysha", 18);
        File file = new File("c:\\tmp\\human.obj");
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();

        FileOutputStream fos = new FileOutputStream(file);

        ObjectOutputStream oos = new ObjectOutputStream(fos);


        oos.writeObject(ksysha);





















    }
}
