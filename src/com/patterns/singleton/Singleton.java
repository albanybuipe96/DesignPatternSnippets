package com.patterns.singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    private String test;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

}

/*

  Step 1: Create a private static instance
  of the class.

  Step 2: Privatise the default constructor
  This prevents indiscriminate object
  instantiation.

  Step 3: Create a static method
  that returns the singleton instance
  instantiated in step 1.

  The method checks to see if the instance
  is null, so that it creates a new Singleton()
  otherwise it simply returns the previous instance.
 */