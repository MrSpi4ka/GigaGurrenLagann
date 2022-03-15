package LessonFourDifficulty;

import java.util.Scanner;

public class LessonFourN2Dif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number in range: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter end number in range: ");
        int endNumber = sc.nextInt();
        System.out.print("Even numbers on range: ");
        foundEvenNumbers(firstNumber, endNumber);

    }

    public static void foundEvenNumbers(int firstNumber, int endNumber) {
        for (int desireNumb = firstNumber+1; desireNumb <endNumber; desireNumb++) {
           if (desireNumb % 2 == 0)
                System.out.println(desireNumb);
        }
    }
}
