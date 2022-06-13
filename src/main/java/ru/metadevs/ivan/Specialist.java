package ru.metadevs.ivan;

public class Specialist implements Employee {

    private String nameOfPerson;
    private int salary;
    private int ageOfPerson;
    private String workingCompany;

    public Specialist(String nameOfPerson, int ageOfPerson) {
        this.nameOfPerson = nameOfPerson;
        this.ageOfPerson = ageOfPerson;

    }

    //region getters/setters

    public void setNameOfPerson(String nameOfPerson) {
        this.nameOfPerson = nameOfPerson;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAgeOfPerson() {
        return ageOfPerson;
    }

    public String getWorkingCompany() {
        return workingCompany;
    }

    public void setWorkingCompany(String workingCompany) {
        this.workingCompany = workingCompany;
    }
    //endregion

    @Override
    public void salaryValidate(int salary) {
        if (salary < ageOfPerson) {
            throw new SalaryValidateException("Salary could not be lower than ageOfPerson");
        }
    }

    @Override
    public void printPersonalInfo() {
        System.out.println("I'm Specialist");
        System.out.print(this.nameOfPerson);
        System.out.print(" " + this.ageOfPerson + " ");
        System.out.printf("%d", this.salary);
    }

    @Override
    public String toString() {
        return "Specialist{" +
                "nameOfPerson='" + nameOfPerson + '\'' +
                ", salary=" + salary +
                ", ageOfPerson=" + ageOfPerson +
                '}';
    }

    @Override
    public String getName() {
        return nameOfPerson;
    }
}