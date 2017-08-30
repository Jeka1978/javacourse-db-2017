package com.db.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evegeny on 30/08/2017.
 */
public class AbstractContainer extends AbstractItem implements Container {

    private List<Item> items = new ArrayList<>();

    public AbstractContainer(int price) {
        super(price);
    }

    @Override
    public int getOwnPrice() {
        return super.getPrice();
    }

    @Override
    public void addItem(Item item) {
        // check if this item exists and throw an exception
        items.add(item);
    }

    @Override
    public int getPrice() {
        return items.stream().mapToInt(Item::getPrice).sum() + getOwnPrice();

    }
}





















