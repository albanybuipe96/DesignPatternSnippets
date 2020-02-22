package com.application.observer;

public class Main {

    public static void main(String[] args) {

        final Celebrity subject = new Celebrity();
        final Follower observer1 = new Follower("John Smith");
        final Follower observer2 = new Follower("Jane Doe");
        final Follower observer3 = new Follower("Robert Smith");

        subject.register(observer1);
        subject.register(observer2);
        subject.register(observer3);

        subject.unregister(observer3);

        subject.setTweet("Design Patterns are a necessity.");
        subject.setTweet("Perhaps, we should explore FP also.");
        subject.notifyObservers();

    }

}


/*
  There are two ways to trigger the notification of the observers:
       1. Setters [in the concrete subjects]
           Pros: Reduced responsibility on client
           Cons: Frequent [and perhaps unnecessary] updates
       2. Client [like I did in my code]
           Pros: Reduced unnecessary frequent updates
           Cons: Increased responsibility on client, Error-prone [forgetting to call notify method]
 */