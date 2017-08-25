package com.db.never_use_switch;/**
 * Created by Evegeny on 25/08/2017.
 */

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
public @interface MailCode {
    int value();
}
