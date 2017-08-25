package com.db.never_use_switch;

/**
 * Created by Evegeny on 25/08/2017.
 */
@MailCode(3)
public class DinnerInformerMailGenerator implements MailGenerator {
    @Override
    public String generateHtml(MailInfo mailInfo) {
        return "А может уже пора обедать, уже?";
    }
}
