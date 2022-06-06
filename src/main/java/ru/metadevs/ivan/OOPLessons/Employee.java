package ru.metadevs.ivan.OOPLessons;

public interface Employee {

    void printPersonalInfo();

    default void needCoffee (){
        System.out.println("I need a cup of Coffee");
    }
}
