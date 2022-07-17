package ru.metadevs.ivan;

import java.util.Arrays;


public class HumanWorker {
    public static void main(String[] args) {

        Company metodoMagya = new Company("OOO YOBA", 4);
        Employee ivan = new Specialist("Ivan", 31);
        Employee keka = new Specialist("Keka", 15);

        metodoMagya.hire(ivan, 15);
        ivan.setSalary(1500);
        ivan.setCompanyName("OOO YOBA");
        ivan.salaryValidate(1500);
        System.out.println(Arrays.toString(metodoMagya.getEmployees()));

        metodoMagya.hire(ivan, 15);
        ivan.setSalary(1500);
        //metodoMagya.printEmployees();

    }

}
