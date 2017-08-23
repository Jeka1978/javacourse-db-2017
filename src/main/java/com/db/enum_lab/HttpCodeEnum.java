package com.db.enum_lab;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

/**
 * Created by Evegeny on 23/08/2017.
 */
@AllArgsConstructor
public enum  HttpCodeEnum {

    INFORMATIONAL(100,199, new InformationalHandler()),
    SUCCESS(200,299, new SuccessHandler()),
    REDIRECTION(300,399, new RedirectionHandler()),
    CLIENT(400,499, new ClientHandler()),
    SERVER(500,599, new ServerHandler());

    private int min;
    private int max;
    private HttpCodeHandler handler;

    public void handle() {
        handler.handle();
    }

    public static HttpCodeEnum findByCode(int code) throws Exception {
        for (HttpCodeEnum value : values()) {
            if (value.min <= code && code <= value.max) {
                return value;
            }
        }
        throw new Exception(code + " not found");
    }
}











