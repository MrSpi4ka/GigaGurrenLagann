package ru.metadevs.ivan;

public interface IdealCompany {

    void fire(Employee specialist);

    void hire(Employee specialist);

    void printEmployees();

    Employee employeeByName(String name);
}
