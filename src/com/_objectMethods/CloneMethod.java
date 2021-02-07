package com._objectMethods;

public class CloneMethod {
    public static void main(String[] args) throws CloneNotSupportedException {

        Employee employee = new Employee(1, "Lito");

        Employee clonedEmployee = (Employee) employee.clone();

        /**
         * x.clone() != x will be true
         */
        System.out.println(clonedEmployee != employee);
        /**
         * x.clone().getClass() == x.getClass() will be true
         * */
        System.out.println(clonedEmployee.getClass() == employee.getClass());

        /**
         * Default equals method checks for references so it should be false. If we want to make it true,
         * then we need to override equals method in Employee class.
         * */
        System.out.println(clonedEmployee.equals(employee));

    }
}

class Employee implements Cloneable {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
