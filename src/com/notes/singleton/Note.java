package com.notes.singleton;

public class Note {
}

/*
  Name:
       1. Singleton Pattern
       2. Monostate Pattern [or Borg Pattern]

  Definition:
      The Singleton Pattern defines a class that has one and only instance of itself,
      and provides a global access to it.

  Scenario:
       There are many cases where there should be just one access point to an object.
       Consider a database, all insertions across a software should modify the same
       database. This provides consistency by way of demonstration.

       Python's modules are a good case for the Singleton Pattern.
       Cashes also make good use of the Singleton pattern.
       Logging systems represent another example of a good use case.
       Registry settings among others.

  Implementation:

  Benefits:
       1. Lazy instantiation of objects

  Gotchas:
       1. Global objects are mostly a bad idea.
       2. Tight coupling. By necessity all dependents of
           the Singleton object are affected when it is modified.

  Monostate Pattern:
       Now that we know the Singleton Pattern, let me mention that
       the Monostate, or Borg Pattern is not strictly the same as
       the Singleton.

       The Singleton Pattern states strictly that there is only one instance.
       The Monostate Pattern, on the other hand, suggests that there could be
       multiple instances but a single state.

       To be really really brief, you can think of it like a privatised global map [dictionary]
       sitting in the class.
       Then there is a method that takes a key-value pair, and stores the pair in the
       map.

       So multiple instances but the same data across the app.
       I have used this also for state management in Flutter.
 */