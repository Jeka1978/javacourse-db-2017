package com.db.school;

import lombok.AllArgsConstructor;

/**
 * Created by Evegeny on 28/08/2017.
 */
@AllArgsConstructor
public enum Operation {
    PLUS("+"),MINUS("-"), MULTIPLY("*");

    private String sign;

}
