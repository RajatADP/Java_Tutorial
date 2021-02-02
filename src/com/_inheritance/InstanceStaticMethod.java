package com._inheritance;

public class InstanceStaticMethod {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.doSomething();
        Parent.printSomething();

        Child child = new Child();
        child.doSomething();
        Child.printSomething();
    }
}

class Parent {
    public static void printSomething() {
        System.out.println("printSomething from Parent");
    }

    public void doSomething() {
        System.out.println("doSomething from parent");
    }
}

class Child extends Parent {
    //hiding
    public static void printSomething() {
        System.out.println("printSomething from Child");
    }

    //overriding
    public void doSomething() {
        System.out.println("doSomething from child");
    }
}