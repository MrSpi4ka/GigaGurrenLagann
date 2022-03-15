package LessonFourDifficulty;

import java.util.Scanner;

public class LessonFourN3Dif {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter numbers of Array: ");
        int array = userInput.nextInt();
        int[] elements = new int[array];
        System.out.println("Enter elements");
        for (int i = 0; i < array; i++) {
            elements[i] = userInput.nextInt();
        }
        System.out.println("Revers orders: ");
        for (int i = elements.length - 1; i >= 0; i--) {
            System.out.println(elements[i]);
        }
    }
}
