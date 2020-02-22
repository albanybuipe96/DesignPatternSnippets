package com.application.proxy;

import com.patterns.proxy.Proxy;
import com.patterns.proxy.RealSubject;

public class NewsProxy extends Proxy {

    private int id;

    public  NewsProxy(int id) {
        this.id = id;
    }

    @Override
    public RealSubject request() {
        if (realSubject == null) {
            realSubject = new RealSubject(id);
        }
        return realSubject;
    }
}
