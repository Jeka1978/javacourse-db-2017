package com.db.mySpring;

import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

/**
 * Created by Evegeny on 28/08/2017.
 */
@Transactional
@Benchmark
public class IRobot {
    private Speaker speaker;

    @PostConstruct
    public void init() {
        System.out.println(speaker.getClass());
    }

    @InjectByType
    private Cleaner cleaner;

    @InjectByType
    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public void cleanRoom() {
        speaker.speak("я начал уборку");
        cleaner.clean();
        speaker.speak("я закончил уборку");
    }

}
