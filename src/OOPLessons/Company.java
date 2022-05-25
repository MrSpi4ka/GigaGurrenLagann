package OOPLessons;

public class Company implements IdealCompany{
    private Employee[] specialists;
    private String name;

    public Company(String name, int amount) {
        this.name = name;
        this.specialists = new Employee[amount];
    }

    public Employee[] getSpecialists() {
        return specialists;
    }


    /*public void hire(Employee specialist) {
        Employee[] checkArray = new Employee[specialists.length+1];
        for (int i = 0; i < specialists.length; i++) {
            if (specialists[i] == null) {
                specialists[i] = specialist;
                return;
            }
        checkArray[i] = specialists[i];
        }
        checkArray[specialists.length] = specialist;
        specialists = checkArray;
    }*/

    /*public void fire(Employee specialist) {
        Employee[] newArray = new Employee[specialists.length - 1];
        for (int i = 0, j = 0; i < specialists.length; i++) {
            if (specialists[i] != specialist) {
                newArray[j++] = specialists[i];
            }
        }
        specialists = newArray;
    }*/

    public void printCompany() {
        for (int i = 0; i < specialists.length; i++) {
            /*System.out.print(specialists[i].getNameOfPerson());
            System.out.print(" " + specialists[i].getAgeOfPerson() + " ");
            System.out.printf("%d", specialists[i].getSalary());
            System.out.println();*/
            specialists[i].whoAreYou();
        }
    }

    @Override
    public void fire(Employee specialist) {
        Employee[] newArray = new Employee[specialists.length - 1];
        for (int i = 0, j = 0; i < specialists.length; i++) {
            if (specialists[i] != specialist) {
                newArray[j++] = specialists[i];
            }
        }
        specialists = newArray;
    }

    @Override
    public void hire(Employee specialist) {
        Employee[] checkArray = new Employee[specialists.length+1];
        for (int i = 0; i < specialists.length; i++) {
            if (specialists[i] == null) {
                specialists[i] = specialist;
                return;
            }
            checkArray[i] = specialists[i];
        }
        checkArray[specialists.length] = specialist;
        specialists = checkArray;
    }
}