package com.db.enum_lab;

/**
 * Created by Evegeny on 23/08/2017.
 */
public class MyException extends RuntimeException {
    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }
}
