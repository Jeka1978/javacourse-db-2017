package com.db.observer;

/**
 * Created by Evegeny on 29/08/2017.
 */
public interface Subscriber {
    void onPost(PostEvent post);
}
