package com.db.enum_lab;

/**
 * Created by Evegeny on 23/08/2017.
 */
public class Main {
    public static void main(String[] args) {
        HttpService httpService = new HttpServiceImpl();

        try {
            httpService.handleHttpCode(999);
        } catch (Exception e) {
            System.out.println("Очень очень важно");
        }
    }
}
