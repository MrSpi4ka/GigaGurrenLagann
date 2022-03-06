package LessonOneDifficuly;

import java.util.Scanner;

public class HardLessonOne {
    public static void main(String[] args) {
        int value1, value2, age;
        String name, surname;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ввод value1: ");
        value1 = sc.nextInt();
        System.out.println("Введите value2: ");
        value2 = sc.nextInt();
        System.out.println("Математическое действие над числами: \n" + "Сумма = " + (value1 + value2) +
                " \nРазность = " + (value1 - value2) +
                " \nПроизведение = " + (value1 * value2));
        System.out.println("Частное: " + (double) value1 / value2);

        sc.nextLine();
        System.out.println("Введите имя: ");
        name = sc.nextLine();
        System.out.println("Введите фамилию: ");
        surname = sc.nextLine();
        System.out.println("Введите возраст: ");
        age = sc.nextInt();
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Возвраст: " + age);
    }
}
