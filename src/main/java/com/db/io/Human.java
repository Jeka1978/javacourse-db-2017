package com.db.io;

import java.io.Serializable;

/**
 * Created by Evegeny on 21/08/2017.
 */
public class Human implements Serializable{
    public static final int MAX_AGE = 120;
    private String name = "Vasya";
    private transient String name2;
    private transient int age;


    public Human(String name, int age) {
        if (age > MAX_AGE) {
        }
        System.out.println();

        this.name = name;
        this.age = age;
    }

    public Human() {

        System.out.println("Human was created");
    }

    public String getName() {
        return this.name;
    }



    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName23() {
        return name2;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Human)) return false;
        final Human other = (Human) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Human;
    }

    public String toString() {
        return "com.db.io.Human(name=" + this.getName() + ", name2="  + ", age=" + this.getAge() + ")";
    }
}
