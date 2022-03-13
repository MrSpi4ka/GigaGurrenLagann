package LessonTheeDifficulty;

import java.util.Scanner;

public class LessonThreeDifficulty {
    public static void main(String[] args) {
        System.out.println("Задача 3.1\n");

        int month;
        System.out.println("Введите номер месяца чтобы опредилить принадлежность к сезону");
        Scanner scan = new Scanner(System.in);
        month = scan.nextInt();
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("This is winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("This is spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("This is summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("This is autumn");
                break;
        }
        System.out.println("\nЗадача 3.2\n");

        int number, i;
        System.out.print("Enter the number: ");
        number = scan.nextInt();
        System.out.print("Enter the i: ");
        i = scan.nextInt();
        if (number < i) {
            while (number < i) {
                System.out.println("number is less then i");
                number++;
            }
        } else {
            System.out.println("number is greater or equals i");
        }

        System.out.println("\nЗадача 3.3\n");
        int a;

        a = 5;
        System.out.println("Compare the variable a = " + a + " with numbers from method");
        System.out.println(additionAndDivisionMethod(a));
        timerForPrintMethods();
        System.out.println(trueOfElseMethod(a));
        timerForPrintMethods();

        a = 0;
        System.out.println("Compare the variable a = " + a + " with numbers from method");
        System.out.println(additionAndDivisionMethod(a));
        timerForPrintMethods();
        System.out.println(trueOfElseMethod(a));
        timerForPrintMethods();

        a = -3;
        System.out.println("Compare the variable a = " + a + " with numbers from method");
        System.out.println(additionAndDivisionMethod(a));
        timerForPrintMethods();
        System.out.println(trueOfElseMethod(a));
        timerForPrintMethods();

        a = 2;
        System.out.println("Compare the variable a = " + a + " with numbers from method");
        System.out.println(additionAndDivisionMethod(a));
        timerForPrintMethods();
        System.out.println(trueOfElseMethod(a));

    }

    public static void timerForPrintMethods() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static String additionAndDivisionMethod(int a) {
        return (a == 0 || a == 2) ? String.valueOf(a + 7) : String.valueOf((double) a / 10);
    }

    public static String trueOfElseMethod(int a) {
        return a > 0 && a < 5 ? "Верно" : "Неверно";
    }
}


