package com.db.composite;

/**
 * Created by Evegeny on 30/08/2017.
 */
public interface Container extends Item {
    int getOwnPrice();

    void addItem(Item item);
}
