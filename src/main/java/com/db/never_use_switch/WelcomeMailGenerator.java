package com.db.never_use_switch;

/**
 * Created by Evegeny on 25/08/2017.
 */
@MailCode(1)
public class WelcomeMailGenerator implements MailGenerator {
    @Override
    public String generateHtml(MailInfo mailInfo) {
        return "Welcome " + mailInfo.getClientData().getClientName();
    }
}
