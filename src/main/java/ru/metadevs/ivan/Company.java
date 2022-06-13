package ru.metadevs.ivan;

public class Company implements IdealCompany {
    private Employee[] employees;
    private String name;

    public Company(String name, int amount) {
        this.name = name;
        this.employees = new Employee[amount];
    }

    public Employee[] getEmployees() {
        return employees;
    }

    @Override
    public void printEmployees() {
        for (Employee specialist : employees) {
            specialist.printPersonalInfo();
            System.out.println();
        }
    }

    @Override
    public void fire(Employee specialist) {
        Employee[] newArray = new Employee[employees.length - 1];
        for (int i = 0, j = 0; i < employees.length; i++) {
            if (employees[i] != specialist) {
                newArray[j++] = employees[i];
            }
        }
        employees = newArray;
    }

    //Перед добавлением сотрудника проверить что сотрудника нету в компании (по имени и возрасту), если сотрудник есть, выкидывать Exception.

    @Override
    public void hire(Employee specialist) {
        Employee[] checkArray = new Employee[employees.length + 1];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = specialist;
                return;
            }
            checkArray[i] = employees[i];
        }
        checkArray[employees.length] = specialist;
        employees = checkArray;
    }//Добавить проверку на SalaryValidate. Метод hire должен принимать Salaray на вход (интовый).
    // После добавления сотрудника в компанию нужно установить сотруднику зарплату и название компании.



    @Override
    public Employee employeeByName(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                return employee;
            }
        } //Под циклом выкинуть NotFoundException (Employee).
        return null;
    }
}