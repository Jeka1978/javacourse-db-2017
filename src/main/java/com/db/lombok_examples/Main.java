package com.db.lombok_examples;

import com.db.PolicyService;

/**
 * Created by Evegeny on 21/08/2017.
 */
public class Main {
    public static void main(String[] args) {


        Person person = new Person();
        person.setAge(12);
        person.setName("Alena");
        person.setSalary(20000);
        Person person2 = new Person();
        person2.setAge(12);
        person2.setName("Alena");
        person2.setSalary(20000);
        System.out.println("person = " + person);

        System.out.println(person.equals(person2));

    }
}
