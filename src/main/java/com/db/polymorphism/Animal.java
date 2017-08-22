package com.db.polymorphism;

/**
 * Created by Evegeny on 21/08/2017.
 */
public  abstract class Animal {
    public abstract void makeVoice() ;

    public void breathe() {
        System.out.println("Я дышу");

    }
}
