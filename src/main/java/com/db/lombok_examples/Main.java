package com.db.lombok_examples;

import com.db.PolicyService;

import java.util.Arrays;

/**
 * Created by Evegeny on 21/08/2017.
 */
public class Main {
    public static void main(String[] args) {


        Client client = Client.builder().name("Тагир").bonus(12)
                .debt(1000).debt(19).beer("Жигулёвское").beer("Невское").beer("Балтика").build();
        System.out.println("client = " + client);

    }
}
