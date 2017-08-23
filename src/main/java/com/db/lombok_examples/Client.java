package com.db.lombok_examples;

import lombok.*;
import lombok.extern.log4j.Log4j;

import java.util.List;

/**
 * Created by Evegeny on 23/08/2017.
 */
@Getter
@Value
@Builder
@Log4j
public class Client {


    @NonNull
    private final String name;
    @NonNull
    private final Integer bonus;
    private final int debt;
    @Singular
    private List<String> beers;


    public void printBeers(){
       log.info(beers);
    }





    public Client addBonus(int delta) {
        return new Client(name, bonus + delta, debt,beers);
    }


}
