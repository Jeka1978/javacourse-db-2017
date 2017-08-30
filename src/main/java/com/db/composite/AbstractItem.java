package com.db.composite;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by Evegeny on 30/08/2017.
 */
@AllArgsConstructor
@Data
public class AbstractItem implements Item {
    private int price;
}
