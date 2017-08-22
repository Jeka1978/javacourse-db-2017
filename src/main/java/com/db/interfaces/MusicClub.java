package com.db.interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evegeny on 22/08/2017.
 */
public class MusicClub {
    private List<Musician> musicians = new ArrayList<>();

    public void addMusician(Musician musician) {
        musicians.add(musician);
    }

    public void играйГормонь() {
        for (Musician musician : musicians) {
            musician.playPiano();
        }
    }
}







