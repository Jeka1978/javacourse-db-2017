package com.db.observer;

/**
 * Created by Evegeny on 29/08/2017.
 */
public interface BlogEngine {
    void addSubscriber(Subscriber subscriber);

    void publishPost(Post post);
}
