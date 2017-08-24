package com.db.never_use_switch;

import org.fluttercode.datafactory.impl.DataFactory;

/**
 * Created by Evegeny on 24/08/2017.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        DataFactory dataFactory = new DataFactory();
        MailSender mailSender = new MailSender();
        while (true) {
            MailInfo mailInfo = new MailInfo(dataFactory.getNumberBetween(1, 7));
            mailSender.sendMail(mailInfo);
            Thread.sleep(1000);
        }
    }
}
