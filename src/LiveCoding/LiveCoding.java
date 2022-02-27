package LiveCoding;

import java.util.Scanner;

public class LiveCoding {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter first variable");
        int value1 = userInput.nextInt();
        System.out.println("Enter second variable");
        int value2 = userInput.nextInt();

        System.out.println("\nEnter the number of the operation: \n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division");
        int operationNumber = userInput.nextInt();

        Addition(value1, value2);
        Difference(value1, value2);
        Multiplication(value1, value2);
        Division(value1, value2);

        switch (operationNumber) {
            case 1:
                System.out.println("Addition = " + Addition(value1, value2));
                break;
            case 2:
                System.out.println("Subtraction = " + Difference(value1, value2));
                break;
            case 3:
                System.out.println("Multiplication = " + Multiplication(value1, value2));
                break;
            case 4:
                System.out.println("Division = " + Division(value1, value2));
            default:
                System.out.println("Operation is undetermined");
        }
    }

    public static int Addition(int x, int y) {
        return x + y;
    }

    public static int Difference(int x, int y) {
        return x - y;
    }

    public static int Multiplication(int x, int y) {
        return x * y;
    }
    public static double Division(int x, int y) {
        double div =(double) x / y;
        return  div;
    }
}
