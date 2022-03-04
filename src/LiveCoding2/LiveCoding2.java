package LiveCoding2;

import java.util.Arrays;
import java.util.Scanner;

public class LiveCoding2 {
    static int myArray[];

    public static void main(String[] args) {
        int numberOfOperation;
        Scanner scan = new Scanner(System.in);
        System.out.printf("Please, select an operation:\n\n" +
                "1 - Enter an array of numbers\n" +
                "2 - Output an array of numbers\n" +
                "3 - Change array element (enter its number and new value)\n" +
                "4 - Remove array element\n" +
                "5 - Add a new array element.\n" +
                "6 - Fill the array with the entered number.\n" +
                "7 - Exit\n");
        do {
            System.out.println("\nPlease, select an operation");
            numberOfOperation = scan.nextInt();
            switch (numberOfOperation) {
                case 1:
                    newArray();
                    break;
                case 2:
                    arrayOutput();
                    break;
                case 3:
                    arrayCorrect();
                    break;
                case 4:
                    arrayElementDelete();
                    break;
                case 5:
                    arrayAddElement();
                    break;
                case 6:
                    arraySameNumber();
                    break;
                default:
                    System.out.println("Operation is not defined");
            }
        }
        while (numberOfOperation != 7);
    }


    public static void newArray() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter the array length");
        int length = scan.nextInt();
        myArray = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Please, enter the " + i + " element of array");
            myArray[i] = scan.nextInt();
        }
    }

    public static void arrayOutput() {
        System.out.println("Your array:");
        for (int i : myArray) {
            System.out.print("[" + i + "]");
        }
    }

    public static void arrayCorrect() {
        System.out.println("Enter the element for change");
        Scanner scan = new Scanner(System.in);
        int element = scan.nextInt();
        System.out.println("Enter the new element");
        myArray[element] = scan.nextInt();
    }

    public static void arrayElementDelete() {
        System.out.println("Enter the element for delete");
        Scanner scan = new Scanner(System.in);
        int deleteElement = scan.nextInt();
        int arrayRemove[] = new int[myArray.length - 1];
        int remainingElements = myArray.length - (deleteElement + 1);
        System.arraycopy(myArray, 0, arrayRemove, 0, remainingElements);
        System.arraycopy(myArray, deleteElement + 1, arrayRemove, deleteElement, remainingElements);
        System.out.println("New array " + Arrays.toString(arrayRemove));
    }

    public static void arrayAddElement() {
        System.out.println("Enter the element for addition");
        Scanner scan = new Scanner(System.in);
        int addElement = scan.nextInt();
        int arrayAddition[] = new int[myArray.length + 1];
        System.arraycopy(myArray, 0, arrayAddition, 0, myArray.length);
        arrayAddition[myArray.length] = addElement;
        System.out.println("New array " + Arrays.toString(arrayAddition));
    }

    public static void arraySameNumber() {
        System.out.println("Enter the element");
        Scanner scan = new Scanner(System.in);
        int sameNumber = scan.nextInt();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = sameNumber;
        }
    }
}