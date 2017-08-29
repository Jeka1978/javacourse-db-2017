package com.db.mySpring;

import lombok.SneakyThrows;

/**
 * Created by Evegeny on 28/08/2017.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        IRobot iRobot = ObjectFactory.getInstance().createObject(IRobot.class);
        iRobot.cleanRoom();

        while (true) {
            iRobot.cleanRoom();
            Thread.sleep(3500);
        }

   /*     Worker worker = ObjectFactory.getInstance().createObject(Worker.class);
        worker.drinkBeer();
        worker.work();*/

    }
}
