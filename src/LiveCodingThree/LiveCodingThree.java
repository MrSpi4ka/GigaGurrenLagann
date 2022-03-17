package LiveCodingThree;

import java.util.Scanner;

public class LiveCodingThree {
    public static void main(String[] args) {
        System.out.println("Введите значение К");
        int k = checkInteger();
        if (k >= 1 && k <= 99) {
            if (k >= 10 && k <= 19) {
                System.out.println("Мне " + k + " лет");
            } else if (k % 10 == 1) {
                System.out.println("Мне " + k + " год");
            } else if (k % 10 == 2 || k % 10 == 3 || k % 10 == 4) {
                System.out.println("Мне " + k + " года");
            } else {
                System.out.println("Мне " + k + " лет");
            }
        } else {
            System.out.println("Столько не живут");
        }
    }

    public static int checkInteger() {
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            System.out.println("Это не целое число");
            scan.next();
        }
        return scan.nextInt();
    }
}
