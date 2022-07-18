package ru.metadevs.ivan;

public class Specialist implements Employee {

    private String nameOfPerson;
    private int salary;
    private int ageOfPerson;
    private String companyName;

    public Specialist(String nameOfPerson, int ageOfPerson) {
        this.nameOfPerson = nameOfPerson;
        this.ageOfPerson = ageOfPerson;
    }

    //region getters/setters
    public void setNameOfPerson(String nameOfPerson) {
        this.nameOfPerson = nameOfPerson;
    }
    public int getAgeOfPerson() {
        return ageOfPerson;
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
        System.out.println(" " + this.companyName);
    }

    @Override
    public String toString() {
        return "Specialist{" +
                "nameOfPerson='" + nameOfPerson + '\'' +
                ", ageOfPerson=" + ageOfPerson +
                ", salary=" + salary +
                ", companyName= " + companyName +
                '}';
    }

    @Override
    public String getName() {
        return nameOfPerson;
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String getCompanyName() {
        return null;
    }
}