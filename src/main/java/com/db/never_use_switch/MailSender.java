package com.db.never_use_switch;

/**
 * Created by Evegeny on 24/08/2017.
 */
public class MailSender {
    public void sendMail(MailInfo mailInfo){
        if (mailInfo.getMailCode() == 1) {
            // 90 lines of code
            System.out.println("WELCOME MAIL WAS SENT TO CLIENT");
        }  else {
            // 85 lines of code
            System.out.println("don't call use we call you");
        }
    }
}
