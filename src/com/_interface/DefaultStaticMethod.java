package com._interface;

/**
 * Extending Interfaces That Contain Default Methods
 */
public class DefaultStaticMethod {
    public static void main(String[] args) {
        I1 i1 = new I1_implementation();
        i1.doSomething();

        I2 i2 = new I2_implementation();
        i2.doSomething();
    }
}

class I1_implementation implements I1 {
    // No need to define default method
}

class I2_implementation implements I2 {
    // No need to define default method
}

class I3_implementation implements I3 {
    // need to define method as its no longer default
    @Override
    public void doSomething() {

    }

}

interface I1 {

    default void doSomething() {
        System.out.println("Default method has implementation here");
    }

}

interface I2 extends I1 {
    default void doSomething() {
        System.out.println("I2 has overridden Default method implementation here");
    }
}

interface I3 extends I1 {
    //Redeclare the default method, which makes it abstract
    void doSomething();
}
