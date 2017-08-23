package com.db.heroes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.fluttercode.datafactory.impl.DataFactory;

/**
 * Created by Evegeny on 23/08/2017.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Character {
    private String name;
    private int hp;
    private int power;
    private Weapon weapon;




    public Character(int hp, int power) {
        this.hp = hp;
        this.power = power;
        String name = DataFactoryHolder.getInstance().getDataFactory().getName();
        setName(name);
    }

    public boolean isAlive() {
        return getHp() > 0;
    }

    public void decreaseHp(int delta) {
        setHp(getHp()-delta);
    }

    public void decreasePower(int delta) {
        setPower(getPower()-delta);
    }

    public void сдохни() {
        setHp(0);
    }


    public abstract void kick(Character enemy);










}
