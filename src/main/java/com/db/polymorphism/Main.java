package com.db.polymorphism;

/**
 * Created by Evegeny on 22/08/2017.
 */
public class Main {
    public static void main(String[] args) {
        AnimalDoctor animalDoctor = new AnimalDoctor();
        Cat cat = new Cat();
        Dog dog = new Dog();

        animalDoctor.treat(cat);

        System.out.println("***********************");

        animalDoctor.treat(dog);

    }
}
