package ru.metadevs.ivan;

public class Manager implements Employee {

    private String nameOfPerson;
    private int ageOfPerson;
    private int salary;
    private String companyName;

    //region getters/setters
    public String getNameOfPerson() {
        return nameOfPerson;
    }
    public int getAgeOfPerson() {
        return ageOfPerson;
    }
    //endregion

    public Manager(String nameOfPerson, int ageOfPerson) {
        this.nameOfPerson = nameOfPerson;
        this.ageOfPerson = ageOfPerson;

    }
    @Override
    public void salaryValidate(int salary) {
        if (salary < ageOfPerson) {
            throw new SalaryValidateException("Salary could not be lower than ageOfPerson");
        }
    }

    @Override
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void printPersonalInfo() {
        System.out.println("I'm Specialist");
        System.out.print(this.nameOfPerson);
        System.out.print(" " + this.ageOfPerson + " ");
        System.out.printf("%d", this.salary);
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
    public String getCompanyName() {
        return null;
    }
}
