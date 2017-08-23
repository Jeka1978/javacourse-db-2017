package com.db.enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * Created by Evegeny on 23/08/2017.
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Person {
    private String name;
    private MaritalStatus maritalStatus;

}
