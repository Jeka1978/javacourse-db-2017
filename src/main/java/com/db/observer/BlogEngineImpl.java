package com.db.observer;

import com.db.mySpring.InjectByType;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Evegeny on 29/08/2017.
 */

public class BlogEngineImpl implements BlogEngine {
    @InjectByType
    private Broadcaster broadcaster;

    @InjectByType
    private List<Subscriber> subscribers;
    private ExecutorService executorService = Executors.newFixedThreadPool(Integer.MAX_VALUE);


    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }


    @Override
    public void publishPost(Post post) {
        broadcaster.broadcast(post);
        PostEvent postEvent = PostEvent.builder().whenReleased(LocalDateTime.now()).post(post).build();
        for (Subscriber subscriber : subscribers) {
            executorService.submit(() -> subscriber.onPost(postEvent));
        }
    }
}
















