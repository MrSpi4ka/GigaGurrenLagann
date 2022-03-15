package LessonFourDifficulty;

import java.util.Scanner;

public class LessonFourN4Dif {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int[][] massArray;
        System.out.println("Enter the massRows: ");
        int massRows = userInput.nextInt();
        System.out.println("Enter the massColumns: ");
        int massColumns = userInput.nextInt();
        massArray = new int[massRows][massColumns];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < massRows; i++) {
            for (int j = 0; j < massColumns; j++) {
                massArray[i][j] = userInput.nextInt();
            }
        }
        presentMyArray(massArray, massRows, massColumns);
        reversArray(massArray);
    }

    public static void presentMyArray(int[][] massArray, int massRows, int massColumns) {
        System.out.println("Present my array: ");
        for (int i = 0; i < massRows; i++) {
            for (int j = 0; j < massColumns; j++) {
                System.out.print(massArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void reversArray(int[][] massArray) {
        int massRows = massArray.length;
        int massColumns = massArray[0].length;
        int[][] array = new int[massRows][massColumns];
        for (int i = massRows - 1; i >= 0; i--) {
            for (int j = massColumns - 1; j >= 0; j--) {
                array[massRows - 1 - i][massColumns - 1 - j] = massArray[i][j];
            }
        }
        for (int i = 0; i < massRows; i++) {
            for (int j = 0; j < massColumns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
