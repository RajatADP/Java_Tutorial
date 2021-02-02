package com._inheritance;

/**
 * Static methods in interfaces are never inherited
 * */

public class InterfaceMethod extends Horse implements I {
    public static void main(String[] args) {
        /**
         * Instance methods are preferred over interface default methods
         */
        InterfaceMethod i = new InterfaceMethod();
        i.printSomething();

    }
}


class Horse {
    public void printSomething() {
        System.out.println("Horse from class is called");
    }
}

interface I {
    default public void printSomething() {
        System.out.println("Horse from I is called");
    }
}


/**
 * Methods that are already overridden by other candidates are ignored.
 * This circumstance can arise when supertypes share a common ancestor
 */


class Dragon implements EggLayer, FireBreather {
    public static void main(String... args) {
        Dragon myApp = new Dragon();
        System.out.println(myApp.identifyMyself());
    }
}

interface Animal {
    default public String identifyMyself() {
        return "I am an animal.";
    }
}

interface EggLayer extends Animal {
    default public String identifyMyself() {
        return "I am able to lay eggs.";
    }
}

interface FireBreather extends Animal {
}


/**
 * If two or more independently defined default methods conflict, or a default method conflicts with an abstract method,
 * then the Java compiler produces a compiler error. You must explicitly override the supertype methods.
 */


class FlyingCar implements OperateCar, FlyCar, BoatCar {

    public static void main(String[] args) {

    }

    // Get error if removed below overridden method
    @Override
    public int startEngine(int key) {
        int fromOperateCar = OperateCar.super.startEngine(1);
        int fromFlyCar = FlyCar.super.startEngine(1);
        return fromOperateCar + fromFlyCar;
    }
}

interface OperateCar {

    default public int startEngine(int key) {
        return key + 1;
    }
}

interface FlyCar {

    default public int startEngine(int key) {
        return key + 2;
    }
}

interface BoatCar {

    int startEngine(int key);
}


