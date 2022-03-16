package LessonTwoDifficulty;

import java.util.Scanner;


public class LessonTwoDifficulty {
    static Scanner sc = new Scanner(System.in);
    static boolean statement;
    static int a, b;
    static int value1, value2;

    public static void main(String[] args) {
        System.out.print("Введите переменную для сравнения: ");

        int value = sc.nextInt();
        if (value > 10) {
            System.out.println("Число больше 10");
        } else {
            System.out.println("Число меньше 10");
        }
        System.out.println();

        firstMethod();
        secondMethod();
        threeMethod();
        fourMethod();
        fiveMethod();
        sixMethod();
        sevenMethod();
        eightMethod();

        String answer;
        String catsHungry = "мяу";
        System.out.println("Что сказала кошка? ");
        sc.nextLine();
        answer = sc.nextLine();
        boolean itsACatOrNot = answer.equalsIgnoreCase(catsHungry);
        if (itsACatOrNot) {
            System.out.println("Да, это кошка");
        } else {
            System.out.println("Нет, это другое существо...");
        }

        System.out.print("Ввести первое число: ");
        value1 = sc.nextInt();
        System.out.print("Ввести второе число: ");
        value2 = sc.nextInt();
        boolean statement1 = value1 > value2;
        boolean statement2 = value1 < value2;
        if (statement1) {
            System.out.println("Первое число больше второго");
        } else if (statement2) {
            System.out.println("Первое число меньше второго");
        } else {
            System.out.println("Числа равны");
        }
    }

    public static void firstMethod() {
        a = 10;
        b = 5;
        if (statement == (a > b)) {
            System.out.println("a>b");
        }
    }

    public static void secondMethod() {
        a = 50;
        b = 25;
        if (statement == (a > b)) {
            System.out.println("a>b");
        }
    }

    public static void threeMethod() {
        a = 67;
        b = 23;
        if (statement == (a < b)) {
            System.out.println("a<b");
        } else {
            System.out.println("Данное сравнение не верно");
        }
    }

    public static void fourMethod() {
        a = 90;
        b = 80;
        if (statement == (a == b)) {
            System.out.println("a==b");
        } else {
            System.out.println("Данное сравнение не верно");
        }
    }

    public static void fiveMethod() {
        System.out.print("Введите значение a = ");
        a = sc.nextInt();
        b = 60;
        if (statement == (a == b)) {
            System.out.println("Сравнение верно");
        } else {
            System.out.println("Сравнение не верно");
        }
    }

    public static void sixMethod() {
        a = 100;
        System.out.print("Введите значение b = ");
        b = sc.nextInt();
        if (statement == (a < b)) {
            System.out.println("Сравнение верно");
        } else if (statement != (a < b)) {
            System.out.println("Не верно");
        }
    }

    public static void sevenMethod() {
        b = 60;
        System.out.print("Введите значение a = ");
        a = sc.nextInt();
        if (statement == (a == b)) {
            System.out.println("Сравнение верно: " + ((a + b) / 2));
        } else {
            System.out.println("Не верный ввод");
        }
    }

    public static void eightMethod() {
        b = 146;
        System.out.print("Введите значение a = ");
        a = sc.nextInt();
        if (statement == (a == b)) {
            System.out.println("Сравнение верно: " + ((a + b) / 2));
        } else {
            System.out.println("Не верный ввод");
        }
    }
}
