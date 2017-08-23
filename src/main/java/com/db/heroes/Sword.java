package com.db.heroes;

import org.fluttercode.datafactory.impl.DataFactory;

/**
 * Created by Evegeny on 23/08/2017.
 */
public class Sword implements Weapon {
    @Override
    public void kick(Character attacker, Character victim) {
        DataFactory dataFactory = DataFactoryHolder.getInstance().getDataFactory();
        int damage = dataFactory.getNumberBetween(0, attacker.getPower());
        victim.decreaseHp(damage);
    }
}
