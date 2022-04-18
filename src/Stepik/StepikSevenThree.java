package Stepik;

import static Stepik.StepikSevenOne.userInput;

public class StepikSevenThree {
    public static void main(String[] args) {

        System.out.println("\nProgram 7.3.1");
        task1();
        System.out.println("\nProgram 7.3.2");
        task2();
        System.out.println("\nProgram 7.3.3.");
        task3();
    }

    private static void task1() {
        int integerNumbers = userInput.nextInt();
        String numbersSequence = Integer.toString(integerNumbers);
        while (integerNumbers != 0) {
            if (integerNumbers > 0 && integerNumbers < 0) {
                System.out.println(" ");
            }
            integerNumbers = userInput.nextInt();
        }
        System.out.println(" " + numbersSequence);

    }

    private static void task2() {
        int n = userInput.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }

    private static void task3() {
        int n;
        int count = 0;
        do {
            n = userInput.nextInt();
            if (n < 0 && n != -9999) {
                count++;
            }
        }
        while (n != -9999);
        if (count > 0) {
            System.out.println("NO");
        } else {
            System.out.printf("YES");
        }
    }


}


