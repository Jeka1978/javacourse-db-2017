package com.db.mySpring;

/**
 * Created by Evegeny on 28/08/2017.
 */
public class IRobot {
    @InjectByFieldType
    private Speaker speaker;

    @InjectByFieldType
    private Cleaner cleaner;

    public void cleanRoom() {
        speaker.speak("я начал уборку");
        cleaner.clean();
        speaker.speak("я закончил уборку");
    }

}
