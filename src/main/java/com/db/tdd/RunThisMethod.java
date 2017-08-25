package com.db.tdd;/**
 * Created by Evegeny on 25/08/2017.
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
public @interface RunThisMethod {
    int repeat() default 10;
}
