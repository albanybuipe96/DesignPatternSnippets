package com.patterns.proxy;

public class RealSubject implements Subject {

    public RealSubject(int id) {}

    @Override
    public RealSubject request() {
        return null;
    }
}
