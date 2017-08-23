package com.db.immutable;

/**
 * Created by Evegeny on 23/08/2017.
 */
public class Main {
    public static void main(String[] args) {

        Client client = Client.builder().name("Vasya").bonus(12).debt(15).build();
        client = client.addBonus(100);
        System.out.println("client = " + client);

        Client armen = Client.builder().bonus(10000).debt(100).build();
        System.out.println("armen = " + armen);


    }
}
