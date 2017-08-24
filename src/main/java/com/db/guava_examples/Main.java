package com.db.guava_examples;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.ArrayListMultimap;

import java.util.concurrent.TimeUnit;

/**
 * Created by Evegeny on 24/08/2017.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayListMultimap<String, String> darkPeople = ArrayListMultimap.create();
        darkPeople.put("Sergey", "Velvet");
        darkPeople.put("Sergey", "Doombar");
        darkPeople.put("Sergey", "Guinness");
        darkPeople.put("Valya", "Oyster");
        darkPeople.put("Valya", "Harp");

        ArrayListMultimap<String, String> lightPeople = ArrayListMultimap.create();
        lightPeople.put("Evgeny", "Blanche");
        lightPeople.put("Evgeny", "Blanche");
        lightPeople.put("Evgeny", "Tuher");
        lightPeople.put("Valya", "Harp");
        lightPeople.put("Valya", "Vasiliostrovskoe");

        darkPeople.putAll(lightPeople);




        System.out.println(darkPeople);


        Cache<String,Integer> cache = CacheBuilder.newBuilder()
                .expireAfterWrite(2, TimeUnit.SECONDS)
                .expireAfterAccess(2,TimeUnit.SECONDS)
                .maximumSize(3)
                .removalListener(removalNotification ->{
                    System.out.println("was removed " + removalNotification.getCause());
                    System.out.println(removalNotification.getKey()+" "+removalNotification.getValue());
                })
                .build();

        cache.put("Valya",24);
        cache.put("Andrey",21);
        cache.put("Sasha",18);
        cache.put("Semen",22);

        System.out.println(cache.asMap());
        Thread.sleep(2000);
        System.out.println(cache.asMap());
        Thread.sleep(2000);
        cache.put("",1);




    }
}
