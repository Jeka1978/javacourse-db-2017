package com.db.never_use_switch;

import static com.db.never_use_switch.MailTypeEnum.findByDbCode;

/**
 * Created by Evegeny on 24/08/2017.
 */
public class MailSender {
    public void sendMail(MailInfo mailInfo){

        MailGenerator mailGenerator = findByDbCode(mailInfo.getMailCode()).getMailGenerator();
        String html = mailGenerator.generateHtml(mailInfo);
        send(html,mailInfo);

    }

    private void send(String html, MailInfo mailInfo) {
        System.out.println("sending... to "+mailInfo.getClientData().getEmail());
        System.out.println("html = " + html);
    }
}
