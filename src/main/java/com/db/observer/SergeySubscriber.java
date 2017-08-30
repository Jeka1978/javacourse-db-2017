package com.db.observer;

/**
 * Created by Evegeny on 29/08/2017.
 */
public class SergeySubscriber implements Subscriber {
    @Override
    public void onPost(PostEvent post) {
        System.out.println("не согласен с "+post.getPost().getAuthor().getName());
    }
}
