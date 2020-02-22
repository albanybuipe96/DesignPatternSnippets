package com.application.observer;

import com.patterns.observer.Observer;
import com.patterns.observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class Celebrity implements Subject {

    List<Observer> observers; // List of observers


    String tweet; // Data interested in by observers

    Celebrity() {
        observers = new ArrayList<Observer>();
    }

    public String getTweet() {
        return tweet;
    }

    public void setTweet(String tweet) {
        this.tweet = tweet;
//        notifyObservers();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(tweet);
        }
    }
}
