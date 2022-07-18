package ru.metadevs.ivan;

import java.util.Arrays;

public class Company implements IdealCompany {
    private Employee[] employees;
    private String companyName;

    public Company(String companyName, int amount) {
        this.companyName = companyName;
        this.employees = new Employee[amount];
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void printEmployees() {
        for (Employee employee : employees) {
            employee.printPersonalInfo();
            System.out.println();
        }
    }

    @Override
    public void fire(Employee employee) {
        if (!existsByName(employee.getName())) {
            throw new EmployeeNotFoundException("There is no such employee in the company");
        }
        Employee[] newArray = new Employee[employees.length - 1];
        for (int i = 0, j = 0; i < employees.length; i++) {
            if (employees[i] != employee) {
                newArray[j++] = employees[i];
            }
        }
        employees = newArray;
    }
    // СДелать эксепшен при попытке уволить несуществующего сотрудника

    @Override
    public void hire(Employee employee, int salary) {
        Employee[] checkArray = new Employee[employees.length + 1];
        if (isEmployeeBelongsToCompany(employee)) {
            throw new EmployeeValidateExceptions("This person is already in staff!");
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return;
            }
            checkArray[i] = employees[i];
        }
        employee.setSalary(salary);
        employee.salaryValidate(salary);
        employee.setCompanyName(this.getCompanyName());

        checkArray[employees.length] = employee;
        employees = checkArray;
    }

    @Override
    public Employee employeeByName(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                return employee;
            }
        }
        throw new EmployeeNotFoundException("There is no such employee in the company");
    }

    private boolean existsByName(String name) {
        try {
            employeeByName(name);
            return true;
        } catch (EmployeeNotFoundException e) {
            return false;
        }
    }// Метод не сильно красивый, но немного иллюстрирует как работать с try\catch
    private boolean isEmployeeBelongsToCompany(Employee employee) {
        return Arrays.asList(employees).contains(employee);
    }
}

