package com.db.never_use_switch;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Map;

/**
 * Created by Evegeny on 25/08/2017.
 */
@AllArgsConstructor
public enum MailTypeEnum {
    WELCOME(1,new WelcomeMailGenerator()),
    EMAIL_CALLBACK(2, new EmailCallbackMailGenerator());




    @Getter
    private final int dbCode;
    @Getter
    private final MailGenerator mailGenerator;


    public static MailTypeEnum findByDbCode(int dbCode) {

        MailTypeEnum[] values = values();
        for (MailTypeEnum value : values) {
            if (value.dbCode == dbCode) {
                return value;
            }
        }
        throw new UnsupportedOperationException(dbCode + " not supported yet");
    }









}




