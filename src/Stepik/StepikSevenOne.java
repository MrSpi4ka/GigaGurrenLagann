package Stepik;

import java.util.Scanner;

public class StepikSevenOne {
    public static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Program 7.1.1");
        task1();
        timerForPrintMethods();
        System.out.println("Program 7.1.2");
        task2();
        timerForPrintMethods();
        System.out.println("\nProgram 7.1.3");
        task3();
        timerForPrintMethods();
        System.out.println("\nProgram 7.1.4");
        task4();
        timerForPrintMethods();
        System.out.println("\nProgram 7.1.5");
        task5();
        timerForPrintMethods();
        System.out.println("\nProgram 7.1.6");
        task6();
        timerForPrintMethods();
        System.out.println("\nProgram 7.1.7");
        task7();
        System.out.println("\nProgram 7.1.8");
        task8();
        System.out.println("\nProgram 7.1.9");
        task9();

    }

    private static void task1() {
        int naturalNumbers = 8;
        for (int i = 1; i <= naturalNumbers; i++) {
            System.out.println("Натуральное число: " + i);
        }
    }

    private static void task2() {
        System.out.println("Enter two integer numbers K, M. Where M > K\n");
        int m = userInput.nextInt();
        int k = userInput.nextInt();
        int numberCount = 0;
        if (m > k) {
            if (k > 0) {
                for (int i = k; i <= m; i++) {
                    System.out.print(i + " ");
                    numberCount++;
                }
                System.out.println("\nNumbers in cycle stream: " + numberCount);

            } else {
                for (int i = 1; i <= m; i++) {
                    System.out.print(i + " ");
                    numberCount++;
                }
                System.out.println("\nNumbers in cycle stream: " + numberCount);
            }
        } else {
            System.out.println("Wrong enter!");
        }
    }

    private static void task3() {
        int a = userInput.nextInt();
        int b = userInput.nextInt();
        if (a < b) {
            for (int i = b; a <= i; i--) {
                System.out.print(" " + i);
            }
        }
    }

    private static void task4() {
        System.out.print("Enter an integer to calculate the factorial k: ");
        int k = userInput.nextInt();
        int factorial = 1;
        if (k <= 12) {
            for (int i = 1; i <= k; i++) {
                factorial = factorial * i;
            }
            System.out.print("Factorial k: " + factorial);
        } else {
            System.out.println("A number greater than a given range!");
        }

    }

    private static void task5() {
        System.out.print("Enter an integer N to calculate the Fibonacci value: ");
        int numberFibo = userInput.nextInt();
        int sumOfFibo;
        int a = 1;
        int b = 1;
        if (numberFibo <= 45) {
            for (int i = 3; i <= numberFibo; i++) {
                sumOfFibo = a + b;
                System.out.println("Fibonacci number is: " + sumOfFibo);
                a = b;
                b = sumOfFibo;
            }

        }
    }

    private static void task6() {
        int a = userInput.nextInt();
        int b = userInput.nextInt();
        if (b <= a) {
            System.out.println("First number a less then two");
        } else {
            for (int i = a; i <= b; i++) {
                for (int j = i; j >= a; j--) {
                    System.out.print(i + "   ");
                }
            }
        }
    }

    private static void task7() {
        int a = userInput.nextInt();
        int b = userInput.nextInt();

        if (b <= a) {
            System.out.println("First number a less then two");
        } else {
            for (int i = a; i <= b; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.printf("%4d", i);
                }
            }
        }
    }

    private static void task8() {
        int n = userInput.nextInt();
        int divider = 0;
        for (int i = 1; i <= n; i++) {
            if ((n % i) == 0) {
                divider++;
                System.out.println(i + " ");
            }
        }
        System.out.println("\n" + divider);
    }

    private static void task9() {
        int n = userInput.nextInt();
        int checkNumber = 0;
        for (int i = 1; i <= n; i++) {
            if ((n % i) == 0) {
                checkNumber++;
            }
        }
        if (checkNumber == 2) {
            System.out.println("1");
        }else {
            System.out.println("0");
        }
    }


    private static void timerForPrintMethods() {
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
