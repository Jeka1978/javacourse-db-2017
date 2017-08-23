package com.db.heroes;

/**
 * Created by Evegeny on 23/08/2017.
 */
public class GameManager {

    private CharacterFactory characterFactory = new CharacterFactory();

    public void duel() {
        Character c1 = characterFactory.createRandomCharacter();
        Character c2 = characterFactory.createRandomCharacter();
        while (c1.isAlive() && c2.isAlive()) {
            c1.kick(c2);
            if (c2.isAlive()) {
                c2.kick(c1);
            }
        }
        if (c1.isAlive()) {
            System.out.println(c1.getName() + " is a winner");
        }
    }
}
