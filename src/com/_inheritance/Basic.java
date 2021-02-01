package com._inheritance;

/*
 * A subclass inherits all the members (fields, methods, and nested classes) from its superclass.
 * Constructors are not members,so they are not inherited by subclasses, but the constructor of
 * the superclass can be invoked from the subclass.*/
public class Basic {

    /*
    * Basic is descended from Object. Therefore, a Basic is a Object
    * and it can be used wherever Object objects are called for.

      The reverse is not necessarily Object may be a Basic, but it isn't necessarily.*/
    public static void main(String[] args) {

        //implicit casting
        Object obj = new Basic();

        //explicit casting
        Basic basic = (Basic) obj;
    }
}
