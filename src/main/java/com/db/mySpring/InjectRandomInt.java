package com.db.mySpring;/**
 * Created by Evegeny on 28/08/2017.
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target(ElementType.FIELD)
public @interface InjectRandomInt {
    int min();
    int max();
}
