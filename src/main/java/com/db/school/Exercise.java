package com.db.school;

import lombok.Data;

/**
 * Created by Evegeny on 28/08/2017.
 */
@Data
public class Exercise {
    private int a;
    private int b;

    private Operation operation;

    private int answer;

    public Exercise(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
