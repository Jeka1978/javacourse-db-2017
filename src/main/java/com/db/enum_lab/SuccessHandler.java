package com.db.enum_lab;

/**
 * Created by Evegeny on 23/08/2017.
 */
public class SuccessHandler implements HttpCodeHandler {
    @Override
    public void handle() {
        System.out.println("Success code was handled");
    }
}
