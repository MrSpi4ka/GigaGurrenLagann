package OOPLessons;

public class Manager implements Employee{

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
    //endregion

    private String nameOfPerson;
    private int salary;
    private int ageOfPerson;
    private String workingCompany;

    public Manager(String nameOfPerson, int salary, int ageOfPerson) {
        this.nameOfPerson = nameOfPerson;
        this.salary = salary;
        this.ageOfPerson = ageOfPerson;
    }

    @Override
    public void whoAreYou() {
        System.out.println("I'm manager");
    }
}
