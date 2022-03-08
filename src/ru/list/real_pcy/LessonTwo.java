package ru.list.real_pcy;

import java.util.Scanner;

public class LessonTwo {
    public static void main(String[] args) {
        final int MONTHS = 12;
        int a = 10;
        int b = 8;
        int d = multiply(a, b);
        sum(a, b);
        sum(3, a);
        sum(5, 23);

        boolean aGreaterThenB = a > b;
        boolean aLessThenB = a < b;
        boolean aGreaterOrEqualThenB = a >= b;
        boolean aLessOrEqualThenB = a <= b;

        if (aGreaterThenB) {
            System.out.println("a>b");
        } else {
            System.out.println("False");
        }
        if (aLessThenB) {
            System.out.println("a<b");
        } else {
            System.out.println("False");
        }
        if (aGreaterOrEqualThenB) {
            System.out.println("a>=b");
        }
        if (aLessOrEqualThenB) {
            System.out.println("a<=b");
        } else {
            System.out.println("False");
        }

        int userInput = new Scanner(System.in).nextInt();
        if (userInput % 2 == 0) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число нечётное");
        }
    }

    static void sum(int x, int y) {
        int z = (x + y);
        if (x == 0) {
            System.out.println("x равно 0");
        } else
            System.out.println(z);
    }

    static int multiply(int x, int y) {
        return x * y;
    }
}
