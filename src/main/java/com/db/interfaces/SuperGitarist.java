package com.db.interfaces;

/**
 * Created by Evegeny on 22/08/2017.
 */
public class SuperGitarist implements Musician, Pilot {

    @Override
    public void playPiano() {
        System.out.println("офигенно играет двумя руками и головой;");
    }

    @Override
    public String readНоты(Noteboook noteboook) {
        return "dksjjhflsdjhsldkaj";
    }

    @Override
    public void land() {
        System.out.println("приземляюсь...");
    }
}
