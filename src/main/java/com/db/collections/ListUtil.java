package com.db.collections;

import com.db.enums.Person;

import java.util.*;

/**
 * Created by Evegeny on 24/08/2017.
 */
public class ListUtil {

    public static void removeClientsByName(List<Client> clients, String name) {
        Iterator<Client> iterator = clients.iterator();
        while (iterator.hasNext()) {
            Client client = iterator.next();
            if (client.getName().equalsIgnoreCase(name)) {
                iterator.remove();
            }
        }


    }


    public  static void printSorted(List<? extends Comparable> list) {
        Collections.sort(list);
        for (Comparable element : list) {
            System.out.println(element);
        }
    }


    public static <T> void printSorted(List<T> list, Comparator<T> comparator) {
        Collections.sort(list,comparator);
        for (T element : list) {
            System.out.println(element);
        }
    }
}













