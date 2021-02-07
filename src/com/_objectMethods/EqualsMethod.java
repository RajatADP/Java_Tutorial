package com._objectMethods;

import java.util.Objects;

public class EqualsMethod {
    int a;

    EqualsMethod() {

    }

    EqualsMethod(int a) {
        this.a = a;
    }

    public static void main(String[] args) {

        EqualsMethod e1 = new EqualsMethod();
        EqualsMethod e2 = new EqualsMethod();

        /**
         * Check reference
         * @returns false
         * */
        System.out.println(e1.equals(e2));


    }

    /**
     * After overriding equals and hashcode
     *
     * @returns true
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqualsMethod that = (EqualsMethod) o;
        return a == that.a;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
}


