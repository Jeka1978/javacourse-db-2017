package com.db.collections;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

/**
 * Created by Evegeny on 24/08/2017.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client implements Comparable<Client> {
    private String name;
    private int bonus;



    @Override
    public int compareTo(Client o) {
        return this.getName().compareTo(o.getName());
    }
}







