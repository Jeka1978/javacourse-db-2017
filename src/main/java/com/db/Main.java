package com.db;


import com.db.lombok_examples.Person;

/**
 * Created by Evegeny on 21/08/2017.
 */
public class Main {


    public static void main(String[] args) {

        Person person = new Person();
        person.setAge(12);

        double[] doubles = {1.0, 2.2, 3.14, 2.7};

        int[] nums = new int[doubles.length];

        int i = 0;

        for (double d : doubles) {
            int temp = (int) d;
            if (temp == d) {
                nums[i] = temp;
                i++;
            }
        }
        for (int num : nums) {
            System.out.println(num);
        }


    }
}



















