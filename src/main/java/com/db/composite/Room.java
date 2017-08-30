package com.db.composite;

import lombok.NoArgsConstructor;

/**
 * Created by Evegeny on 30/08/2017.
 */
public class Room extends AbstractContainer {
    public Room(int price) {
        super(price);
    }

    public Room(){
        super(0);
    }
}
