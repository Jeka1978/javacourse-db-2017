package com.db.mySpring;

/**
 * Created by Evegeny on 28/08/2017.
 */
public class IRobot {
    private Speaker speaker = ObjectFactory.getInstance().createObject(Speaker.class);
    private Cleaner cleaner = ObjectFactory.getInstance().createObject(Cleaner.class);

    public void cleanRoom() {
        speaker.speak("я начал уборку");
        cleaner.clean();
        speaker.speak("я закончил уборку");
    }

}
