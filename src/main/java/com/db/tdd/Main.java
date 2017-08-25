package com.db.tdd;

/**
 * Created by Evegeny on 25/08/2017.
 */
public class Main {
    public static void main(String[] args) {
        TestRunner testRunner = new TestRunner();
        MyTest myTest = new MyTest();
        testRunner.runAllTestMethods(myTest);
    }
}
