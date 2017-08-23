package com.db.heroes;

import org.fluttercode.datafactory.impl.DataFactory;

import java.util.List;
import java.util.function.Supplier;

/**
 * Created by Evegeny on 23/08/2017.
 */
public class CharacterFactory {

    private List<Supplier<Character>> characterSuppliers;


    public CharacterFactory() {
        characterSuppliers.add(Elf::new);
        characterSuppliers.add(Hobbit::new);
        characterSuppliers.add(King::new);
    }

    public Character createRandomCharacter() {
        DataFactory dataFactory = DataFactoryHolder.getInstance().getDataFactory();
        Supplier<Character> supplier = dataFactory.getItem(characterSuppliers);
        return supplier.get();

    }
}







