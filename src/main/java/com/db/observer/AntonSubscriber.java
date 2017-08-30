package com.db.observer;

/**
 * Created by Evegeny on 29/08/2017.
 */
public class AntonSubscriber implements Subscriber {
    @Override
    public void onPost(PostEvent post) {
       while (true){}
//        System.out.println(post.getPost().getContent()+" очень клёвый текст, рекомендую");
    }
}
