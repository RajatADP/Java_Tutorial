package com._interface;

public class ImplementingInterface {
    public static void main(String[] args) {

        Relatable relatable = new RelatableImplementation();
        int result = relatable.isLargerThan(new RelatableImplementation());
        System.out.println(result);
    }
}

class RelatableImplementation implements Relatable {

    @Override
    public int isLargerThan(Relatable relatable) {
        RelatableImplementation implementation = (RelatableImplementation) relatable;
        if (this.getArea(1, 2) > implementation.getArea(2, 3))
            return 1;
        else if (this.getArea(1, 2) < implementation.getArea(2, 3))
            return -1;
        else return 0;
    }

    private int getArea(int x, int y) {
        return x * y;
    }
}


interface Relatable {

    int isLargerThan(Relatable relatable);
}