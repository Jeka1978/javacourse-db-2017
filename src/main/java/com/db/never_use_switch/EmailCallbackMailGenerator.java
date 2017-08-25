package com.db.never_use_switch;

/**
 * Created by Evegeny on 25/08/2017.
 */
public class EmailCallbackMailGenerator implements MailGenerator {
    @Override
    public String generateHtml(MailInfo mailInfo) {
        return "don't call us we call you...";
    }
}
