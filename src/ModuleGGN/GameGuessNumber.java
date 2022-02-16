package ModuleGGN;

import java.util.Scanner;

public class GameGuessNumber {
    public static void main(String[] args) {

        int rangeOfRandom = 100;
        int winOrDie = 10;
        int divineRandom = mathRandom(rangeOfRandom);

        System.out.println("Я загадал случайное число от 1 до " + rangeOfRandom);

        for (int i = 1; i <= winOrDie; i++) {
            System.out.println("Попытка №" + i);
            int userInput = new Scanner(System.in).nextInt();
            if (userInput < divineRandom) {
                System.out.println("Введенное число меньше загаданого");
            } else if (userInput > divineRandom) {
                System.out.println("Введённое число больше загаданного");
            } else {
                System.out.println("Вы угадали");
                break;
            }
        }
    }

    public static int mathRandom(int rangeOfRandom) {
        int mathRnd = (int) (Math.random() * (rangeOfRandom + 1));
        return mathRnd;
    }
}