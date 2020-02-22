package com.application.observer;

import com.patterns.observer.Observer;

public class Follower implements Observer {

    String name;
    String tweet;

    Follower(String name) {
        this.name = name;
    }

    public String getName() {
        return tweet;
    }
    public void setName(String tweet) {
        this.tweet = tweet;
    }

    @Override
    public void update(String tweet) {
        this.tweet = tweet;
        System.out.println("Latest tweet: " + tweet);
    }

}
