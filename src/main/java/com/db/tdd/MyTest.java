package com.db.tdd;

import lombok.Data;
import lombok.SneakyThrows;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Evegeny on 25/08/2017.
 */

@RunThisMethod
@Data
public class MyTest {



    @RunThisMethod
    public void before() {
        System.out.println("BEFORE");
    }

    @RunThisMethod(repeat = 3)
    public void test1(){
        System.out.println("!11111111111111!");
    }
    public void test2(){
        System.out.println("!22222222222222!");
    }


    public static void main(String[] args) {
        System.out.println(1.1+1.3);
    }
















}
