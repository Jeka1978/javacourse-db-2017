package com.db.polymorphism;

/**
 * Created by Evegeny on 21/08/2017.
 */
public class Cat extends Animal {


    @Override
    public void breathe() {
        System.out.println(123);
        super.breathe();
    }

    @Override
    public void makeVoice() {

        System.out.println("ииииааааууууу");
    }
}
