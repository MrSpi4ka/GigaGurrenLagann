package ru.metadevs.ivan;

public interface Employee {

    void printPersonalInfo();

    String getName();
    void setSalary(int salary);
    void salaryValidate(int salary);
    void setCompanyName(String companyName);
    String getCompanyName();

    default void needCoffee() {
        System.out.println("I need a cup of Coffee");
    }
}
