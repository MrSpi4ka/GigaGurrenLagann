package PussyFeeder;

import java.util.Scanner;

public class PussyFeeder {
    static String[] cats = new String[]{"Персик", "Пертурабо", "Кека", "Пыжик"};
    static int[] catsFood = new int[]{1, 3, 5, 0};
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int userInput;
        do {
            printMenu();
            seeCatsAndFood();

            userInput = wrongEnter();

            switch (userInput) {
                case 1:
                    giveKittyFood();
                    break;
                case 2:
                    takeFoodFromKitty();
                    break;
                case 3:
                    takeOrGiveFoodToAllCats();
                    break;
                case 4:
                    foodForEvenOddCats();
                    break;
                default:
                    System.out.println("Выберите номера операции");
            }
        } while (userInput != 666);
    }

    public static void seeCatsAndFood() {
        for (int i = 0; i < cats.length; i++) {
            System.out.println(i + 1 + " - " + cats[i] + " : " + catsFood[i] + " пакетиков");
        }
    }

    public static void printMenu() {
        System.out.println("Выберите что вы хотите сделать: ");
        System.out.println("1 - Добавить еды конкретному  коту: ");
        System.out.println("2 - Убавить еды у конкретного кота: ");
        System.out.println("3 - Добавить/убавить еды у всех котов сразу: ");
        System.out.println("4 - Добавить/убавить еды у четныъ/нечетных котов: ");
        System.out.println("5 - Написать 666 для выхода из программы.");

        System.out.println("\n");
    }

    public static void giveKittyFood() {
        System.out.println("Выберите хорошего котика: ");
        int choiceCat = sc.nextInt();
        for (int i = 0; i < cats.length; i++) {
            System.out.println(i + " - " + cats[i]);
        }
        System.out.print("Добавить сколько-то пакетиков корма в миску: ");
        int giveAFood = sc.nextInt();
        catsFood[choiceCat] = catsFood[choiceCat] + giveAFood;
    }

    public static void takeFoodFromKitty() {
        System.out.println("Выберите плохого котика: ");
        for (int i = 0; i < cats.length; i++) {
            System.out.println(i + " - " + cats[i]);
        }
        int choiceCat = sc.nextInt();
        System.out.println("Убрать сколько-то пакетиков корма из миски: ");
        int takeAFood = sc.nextInt();
        catsFood[choiceCat] = catsFood[choiceCat] - takeAFood;
    }

    public static void takeOrGiveFoodToAllCats() {
        System.out.println("Решите, дать ли котам еду или забрать");
        int someFood = sc.nextInt();
        for (int i = 0; i < cats.length; i++) {
            if (someFood > 0) {
                catsFood[i] = catsFood[i] + someFood;
            } else if (someFood < 0) {
                catsFood[i] = catsFood[i] + someFood;
            }
        }
    }

    public static void foodForEvenOddCats() {
        System.out.println("Выберите действие с едой для четных или нечетных котов");
        System.out.println("1. Изменить количество еды у нечётных.");
        System.out.println("2. Изменить количество еды у чётных.");
        int evenUnevenCats = sc.nextInt();
        System.out.print("Введите N пакетиков с едой:");
        int newFood = sc.nextInt();
        if (newFood < 0 || newFood > 7) {
            System.out.println("Введите число не более 7");
        } else if (evenUnevenCats == 1) {
            for (int i = 0; i < catsFood.length; i++) {
                if (i % 2 == 0) {
                    catsFood[i] = newFood;
                }
            }
        }
        if (evenUnevenCats == 2) {
            for (int i = 0; i < catsFood.length; i++) {
                if (i % 2 != 0) {
                    catsFood[i] = newFood;
                }
            }
        } else System.out.println("Неверная команда");
    }

    public static int wrongEnter() {
        while (!sc.hasNextInt()) {
            System.out.println("Вы ввели не число");
            sc.next();
        }
        return sc.nextInt();
    }
}
