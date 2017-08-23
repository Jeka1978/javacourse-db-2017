package com.db.enum_lab;

import lombok.SneakyThrows;

/**
 * Created by Evegeny on 23/08/2017.
 */
public class HttpServiceImpl implements HttpService {
    @Override
    @SneakyThrows
    public void handleHttpCode(int code) {
        HttpCodeEnum.findByCode(code).handle();
    }

    public static void main(String[] args) {
        System.out.println(Math.sqrt(-1.0));

    }
}
