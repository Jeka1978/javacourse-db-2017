package com.db.heroes;

/**
 * Created by Evegeny on 23/08/2017.
 */
public class Elf extends Character {
    public Elf() {
        super(10,10);
    }

    @Override
    public void kick(Character enemy) {
        if (getPower() > enemy.getPower()) {
            enemy.сдохни();
        }else {
            enemy.decreasePower(1);
        }
    }
}
