package com.db;

/**
 * Created by Evegeny on 22/08/2017.
 */
public abstract class MailSender {
    public final void sendMail(){
        generateHeader();
        generateBody();
        send();
    }

    protected abstract void generateHeader();
    protected abstract void generateBody();
    protected abstract void send();


}
