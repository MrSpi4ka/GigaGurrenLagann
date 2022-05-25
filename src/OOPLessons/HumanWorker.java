package OOPLessons;

import java.util.Arrays;
import java.util.Scanner;


public class HumanWorker {
    public static void main(String[] args) throws Exception {

        Specialist chaptMaster = new Specialist("Vasya", 12, 1222);
        chaptMaster.setNameOfPerson("Pepegor");
        chaptMaster.getWorkingCompany("OOO YOBA");
        System.out.println(chaptMaster.getNameOfPerson());
        System.out.println(Specialist.salaryComparAge(31, 30000));

        Company metodoMagya = new Company("OOO YOBA", 4);

        Employee ivan = new Manager("Ivan", 31, 15000);
        metodoMagya.hire(ivan);
        System.out.println(Arrays.toString(metodoMagya.getSpecialists()));

        Employee lalka = new Specialist("Lalka", 18, 35000);
        metodoMagya.hire(lalka);
        System.out.println(Arrays.toString(metodoMagya.getSpecialists()));

        Employee chad = new Manager("Chad", 35, 60000);
        metodoMagya.hire(chad);
        System.out.println(Arrays.toString(metodoMagya.getSpecialists()));

        Employee gigaChad = new Specialist("GigaChad", 32, 100000);
        metodoMagya.hire(gigaChad);
        System.out.println(Arrays.toString(metodoMagya.getSpecialists()));

        Employee pepe = new Manager("Pepe", 32, 100000);
        metodoMagya.hire(pepe);
        System.out.println(Arrays.toString(metodoMagya.getSpecialists()));

        metodoMagya.printCompany();

        metodoMagya.fire(pepe);

        Specialist.salaryValidate();
    }

    public static int inputCheck(Scanner userInput) {
        while (!userInput.hasNextInt()) {
            System.out.println("It's not an integer, try again");
            userInput.nextInt();
        }
        return userInput.nextInt();
    }

}
