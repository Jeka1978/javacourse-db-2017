package com.db.guess_game_lab;

import lombok.EqualsAndHashCode;

import javax.swing.*;
import java.util.Random;

/**
 * Created by Evegeny on 22/08/2017.
 */
public class Main {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("input your name");
        System.out.println("Я тебя знаю, тебя же зовут "+s.toUpperCase());

        Random random = new Random();


        int i = random.nextInt(100);




    }
}
