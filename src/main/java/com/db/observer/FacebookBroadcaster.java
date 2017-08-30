package com.db.observer;

/**
 * Created by Evegeny on 29/08/2017.
 */
public class FacebookBroadcaster implements Broadcaster {
    @Override
    public void broadcast(Post post) {
        System.out.println(post+" was published in facebook");
    }
}
