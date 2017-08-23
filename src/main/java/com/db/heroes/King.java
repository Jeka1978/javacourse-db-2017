package com.db.heroes;

import lombok.Setter;

import static com.db.heroes.DataFactoryHolder.getInstance;

/**
 * Created by Evegeny on 23/08/2017.
 */
public class King extends Character {
    @Setter
    private Weapon weapon = new Sword();
    public King() {
        super(getInstance().getDataFactory().getNumberBetween(5,15),
                getInstance().getDataFactory().getNumberBetween(5,15));

    }

    @Override
    public void kick(Character enemy) {
        weapon.kick(this,enemy);
    }
}
