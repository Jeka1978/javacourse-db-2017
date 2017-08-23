package com.db.enums;

import com.db.heroes.*;
import com.db.heroes.Character;
import lombok.AllArgsConstructor;
import lombok.Getter;


/**
 * Created by Evegeny on 23/08/2017.
 */

@AllArgsConstructor
@Getter
public enum MaritalStatus {
    SINGLE("холостой", new SingleDateBehavior()),
    MARRIED("женат",null),
    DIVORCED("разведен",null),
    WIDOW("вдовец",null);

    private String russianDesc;
    private DateBehavior dateBehavior;



    @Override
    public String toString() {
        return russianDesc;
    }
}
