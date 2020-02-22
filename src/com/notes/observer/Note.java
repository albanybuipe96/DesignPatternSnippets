package com.notes.observer;

public class Note {
}

/*
  Name:
       1. Observer Pattern
       2. Publish-Subscribe
       3. Dependents
 
  Definition:
       The Observer Pattern defines a one-to-many dependency relationship such
       that a change in the one [independent] object triggers a change in the
       dependent objects.
 
  Scenario:
       The example I have in my code represents a celebrity that is followed by
       a large number of followers on some Social Media platform, say, Twitter.
 
       The celebrity in Design Patterns is referred to as a Subject [or Observable, or
       Publisher] and the followers as Observers [or Subscribers].
 
       Thus, if the Subject, celebrity in our case, tweets anything new, the Observer[s],
       so those are the followers, are notified to update themselves.
 
       Spreadsheet applications also represent another clear demonstration of the Observer Pattern.
 
       So there is a table that keeps records that can change, and there are charts that depend on
       the records in the table.
 
       The Observer Pattern determines that we create a relationship between these different
       components, the relationship should be loosely coupled, so we use interfaces to
       define an Observer and a Subject. We'll move to the implementation and talk more about this.
 
       Now imaging, any other way to solve these particular problems. It's just so hard without the Observer
       Pattern.
 
  Implementation:
 
  Benefits:
       1. Loose coupling of objects
       2. Broadcast communication
 
  Trade Offs:
 */
