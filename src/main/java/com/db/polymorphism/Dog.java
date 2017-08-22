package com.db.polymorphism;

/**
 * Created by Evegeny on 21/08/2017.
 */
public class Dog extends Animal {

    public void даватьЛапу() {
        System.out.println("на тебе лапу!!!");
    }

    @Override
    public void makeVoice() {
        System.out.println("au au");
    }
}
