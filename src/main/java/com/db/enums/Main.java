package com.db.enums;

import static com.db.enums.MaritalStatus.*;

/**
 * Created by Evegeny on 23/08/2017.
 */
public class Main {
    public static void main(String[] args) {
        Person armen = new Person("Armen", MARRIED);
        if (armen.getMaritalStatus() == MARRIED) {
            System.out.println("так он же женат");
        }
        System.out.println(armen.getMaritalStatus());
        armen.getMaritalStatus().getDateBehavior().ходитьНаСвидание();

    }
}
