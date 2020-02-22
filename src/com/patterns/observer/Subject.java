package com.patterns.observer;

public interface Subject {

    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers();

}



/**
 *
 * The terms [register], [unregister], and [notifyObservers] are simply method names of course.
 * Therefore, as identifiers you can name them whatever you want.
 * GoF for instance called them attach(), detach() and notify().
 *
 */