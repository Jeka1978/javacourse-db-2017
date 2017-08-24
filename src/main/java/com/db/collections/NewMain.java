package com.db.collections;

import com.db.polymorphism.Animal;
import com.db.polymorphism.Dog;

import java.util.*;

/**
 * Created by Evegeny on 24/08/2017.
 */
public class NewMain {
    public static void main(String[] args) {
        List<Client> list = new ArrayList<>();


        list.add(new Client("John",100));
        list.add(new Client("Vasya",300));
        list.add(new Client("Pert",50));
        list.add(new Client("Nadia",100));

        ListUtil.printSorted(list);

        ListUtil.printSorted(list, new Comparator<Client>() {
            @Override
            public int compare(Client o1, Client o2) {
                return o1.getBonus()-o2.getBonus();
            }
        });


    }
}








