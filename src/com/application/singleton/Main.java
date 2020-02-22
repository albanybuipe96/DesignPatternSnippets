package com.application.singleton;

import com.patterns.singleton.Singleton;

public class Main {

    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        singleton1.setTest("Test test");
        String test = singleton2.getTest();
        System.out.println(test);

    }

}
