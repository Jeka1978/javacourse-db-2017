package com.db.heroes;

/**
 * Created by Evegeny on 23/08/2017.
 */
public class Hobbit extends Character {
    public Hobbit() {
        super(3,0);
    }

    @Override
    public void kick(Character enemy) {
        cry();
    }

    private void cry() {

        System.out.println("я плакаль");
    }
}






