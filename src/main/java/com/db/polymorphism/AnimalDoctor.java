package com.db.polymorphism;

/**
 * Created by Evegeny on 22/08/2017.
 */
public class AnimalDoctor {
    public void treat(Animal animal) {
        animal.breathe();
        animal.makeVoice();

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.даватьЛапу();
        }


    }
}
