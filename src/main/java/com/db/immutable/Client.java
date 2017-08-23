package com.db.immutable;

import lombok.Getter;
import lombok.ToString;

/**
 * Created by Evegeny on 23/08/2017.
 */
@ToString
@Getter
public class Client {
    private final String name;
    private final int bonus;
    private final int debt;

    public static Builder builder() {
        return new Builder();
    }

    private Client(String name, int bonus, int debt) {
        this.name = name;
        this.bonus = bonus;
        this.debt = debt;
    }


    public Client addBonus(int delta) {
        return new Client(name, bonus + delta, debt);
    }




    public static class Builder{
        private String name;
        private int bonus;
        private int debt;

        private boolean alreadyUsed;


        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder bonus(int bonus) {
            this.bonus = bonus;
            return this;
        }

        public Builder debt(int debt) {
            this.debt = debt;
            return this;
        }


        public Client build() {
            validate();
            alreadyUsed = true;
            return new Client(name, bonus, debt);
        }

        private void validate() {
            if (alreadyUsed) {
                throw new RuntimeException("builder closed");
            }
            if (name == null) {
                throw new IllegalStateException("name can't be null");
            }
        }
    }






















}





