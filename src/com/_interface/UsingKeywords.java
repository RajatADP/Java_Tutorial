package com._interface;

public class UsingKeywords {

    public static void main(String[] args) {
        SuperClass superClass = new ChildClass();
        superClass.printMethod();
    }

}

class SuperClass {
    public void printMethod() {
        System.out.println("Printed in Superclass.");
    }
}

class ChildClass extends SuperClass {
    public void printMethod() {
        super.printMethod();
        System.out.println("Printed in Subclass.");
    }
}
