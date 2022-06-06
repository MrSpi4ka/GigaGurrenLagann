package ru.metadevs.ivan.OOPLessons;

public class Specialist implements Employee {

    private String nameOfPerson;
    private int salary;
    private int ageOfPerson;
    private String workingCompany;

    public Specialist(String nameOfPerson, int ageOfPerson, int salary) {
        this.nameOfPerson = nameOfPerson;
        this.ageOfPerson = ageOfPerson;
        this.salary = salary;
    }

    //region getters/setters
    public String getNameOfPerson() {
        return nameOfPerson;
    }

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

    public void setAgeOfPerson(int ageOfPerson) {
        this.ageOfPerson = ageOfPerson;
    }

    public String getWorkingCompany(String ooo_yoba) {
        return workingCompany;
    }

    public void setWorkingCompany(String workingCompany) {
        this.workingCompany = workingCompany;
    }
    //endregion

    static boolean salaryComparAge(int salary, int ageOfPerson) {
        return salary > ageOfPerson;
    }

    public static void salaryValidate() throws Exception {
        boolean validate = salaryComparAge(31, 30000);
        if (!validate) {
            throw new Exception("Incorrect data");
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

}