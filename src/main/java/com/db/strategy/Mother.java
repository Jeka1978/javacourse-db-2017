package com.db.strategy;

/**
 * Created by Evegeny on 25/08/2017.
 */
public interface Mother {
    default void speak(){
        System.out.println("СЫНОК ИДИ КУШАТЬ!!!!");
    }
}
