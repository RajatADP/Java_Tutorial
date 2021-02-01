package com._interface;


/**
 * All constant values defined in an interface are implicitly public, static, and final
 * All abstract, default, and static methods in an interface are implicitly public
 * */
public class Basic {
    public static void main(String[] args) {

    }
}

interface I {
    int index = 1;
    void doSomething (int i, double x);
    int doSomethingElse(String s);
}
