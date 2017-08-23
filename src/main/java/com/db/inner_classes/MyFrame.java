package com.db.inner_classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Evegeny on 23/08/2017.
 */
public class MyFrame extends JFrame{

    public MyFrame()  {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(600,600);
        int[] counter= new int[1];


        JButton button = new JButton("click to change color");
        getContentPane().add(button,BorderLayout.NORTH);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("xxxxx = " +  counter[0]++);
            }
        });


        setVisible(true);
    }
}
