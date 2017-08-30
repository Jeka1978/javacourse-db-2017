package com.db.observer;

import com.db.mySpring.ObjectFactory;

import java.time.LocalDateTime;

import static java.time.LocalDateTime.now;

/**
 * Created by Evegeny on 29/08/2017.
 */
public class Main {
    public static void main(String[] args) {
        BlogEngine blogEngine = ObjectFactory.getInstance().createObject(BlogEngine.class);

  /*      blogEngine.addSubscriber(new SergeySubscriber());
        blogEngine.addSubscriber(new AntonSubscriber());*/

        Post post = Post.builder().author(Author.builder().name("Putin").build())
                .content("Кому деньги дороже чести, тот оставь службу!").whenPublished(now()).build();


        blogEngine.publishPost(post);




    }
}
