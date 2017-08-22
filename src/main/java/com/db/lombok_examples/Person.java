package com.db.lombok_examples;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.swing.*;

/**
 * Created by Evegeny on 21/08/2017.
 */
@Data
@EqualsAndHashCode(exclude = "age")
public class Person extends Object {
    private int age = 12;
    private String name;
    private int salary;


    public void popupMyName(){
        JOptionPane.showMessageDialog(null,name);
    }


    {
        System.out.println(123);
    }

    {
        init();
    }

    private void init() {
        System.out.println("Person was created!!!");
    }


    public Person() {

    }

    public Person(String name) {

        this.name = name;
    }

    public Person(String name, int salary) {

        this.name = name;
        this.salary = salary;
    }
}
