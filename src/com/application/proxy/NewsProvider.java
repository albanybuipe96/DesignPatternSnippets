package com.application.proxy;

import com.patterns.proxy.RealSubject;
import com.patterns.proxy.Subject;


public class NewsProvider implements Subject {

    public void fetchNews() {}

    @Override
    public RealSubject request() {
        return null;
    }
}
