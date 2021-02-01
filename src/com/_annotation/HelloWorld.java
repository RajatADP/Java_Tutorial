package com._annotation;

/**
 * To add metadata with comment lines
 */

// Author: John Doe
// Date: 3/17/2002
// Current revision: 6
// Last modified: 4/12/2004
// By: Jane Doe
// Reviewers: Alice, Bill, Cindy
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        HelloWorld_1 helloWorld_1 = new HelloWorld_1();
        helloWorld_1.deprecatedMethod();
    }
}
