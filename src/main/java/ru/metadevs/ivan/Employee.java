package ru.metadevs.ivan;

public interface Employee {

    void printPersonalInfo();

    String getName();

    void salaryValidate(int salary);

    default void needCoffee() {
        System.out.println("I need a cup of Coffee");
    }
}
