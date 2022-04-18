package Stepik;

import static Stepik.StepikSevenOne.userInput;

public class StepikEightOne {
    public static void main(String[] args) {
        System.out.println("\nProgram 8.1.1");
        task1();
        System.out.println("\nProgram 8.1.2");
        task2();
        System.out.println("\nProgram 8.1.6");
        task6();
    }

    private static void task1() {
        int n = userInput.nextInt();
        int[] arrayOfNumbers = new int[n];
        System.out.println("Set an array of numbers: ");
        for (int i = 0; i < n; i++) {
            arrayOfNumbers[i] = userInput.nextInt();
        }
        System.out.println("Now we will reversed an array");
        for (int i = arrayOfNumbers.length - 1; i >= 0; i--) {
            System.out.print(arrayOfNumbers[i] + " ");
        }
    }

    private static void task2() {
        int n = userInput.nextInt();
        int[] polyndromArray = new int[n];
        boolean statement = true;
        System.out.println("Set an array of numbers: ");
        for (int i = 0; i < n; i++) {
            polyndromArray[i] = userInput.nextInt();
        }
        int polyndronComparsion = polyndromArray.length;
        for (int j = 0; j <= polyndromArray.length / 2; j++) {
            if (polyndromArray[j] != polyndromArray[polyndronComparsion - j - 1]) {
                statement = false;
                break;
            }
        }

        if (statement) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static void task6() {
        int n = userInput.nextInt();
        int[] polyndromArray = new int[n];
        double arifmeticMean = 0;
        System.out.println("Set an array of numbers: ");
        for (int i = 0; i < n; i++) {
            polyndromArray[i] = userInput.nextInt();
        }
        if (polyndromArray.length > 0) {
            double sumOfElements = 0;
            for (int j = 0; j < polyndromArray.length; j++) {
                sumOfElements += polyndromArray[j];
            }
            arifmeticMean = sumOfElements / polyndromArray.length;
        }
        System.out.printf("The arithmetic mean of the array elements "+ "%.2f ", + arifmeticMean);

    }

}
