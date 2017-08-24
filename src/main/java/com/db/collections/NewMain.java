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


        list.add(new Client("Arnold",100));
        list.add(new Client("Stallone",300));
        list.add(new Client("Chuck Norris",50));
        list.add(new Client("Chuck Norris",50));

        ListUtil.removeClientsByName(list,"Chuck Norris");

        System.out.println(list);


    }
}








