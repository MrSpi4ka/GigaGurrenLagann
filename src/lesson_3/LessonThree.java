package lesson_3;

public class LessonThree {

    public static void main(String[] args) {
        int num = 1;
        switch (num) {
            case 1:
                System.out.println("Число равно 1");
                break;
            case 8:
                System.out.println("Число равно 8");
                num++;
                break;
            case 9:
                System.out.println("Число равно 9");
                break;
            default:
                System.out.println("Число не равно 1, 8, 9");
        }


        if (num == 1) {
            System.out.println("Число равно 1");
        } else if (num == 8) {
            num++;
        } else {
            System.out.println("Число не равно 1, 8, 9");
        }

        negativeComparisons(1);
        lightweightCycle(2);
        isNumberEqualsTen(1);
        positiveComparisons(1);

        //Подсчёт количества високосных годов
        int year = 85;
        while (year >= 0) {
            if (year % 4 == 0) {
                System.out.println("Високосный год " + year);
            }
            year--;
        }
    }

    public static void negativeComparisons(int num) {
        if (num != 8 && num != 1 && num != 9) {
            System.out.println("Число не равно 1, 8, 9");
        } else {
            System.out.println("Число равно 1, 8, 9");
        }
    }

    public static void positiveComparisons(int boom) {
        if (boom == 0 || boom == 1) {
            System.out.println("Число равно 1 или 0");
        } else {
            System.out.println("Число не равно ни 1, ни 0");
        }
    }

    public static void lightweightCycle(int i) {
        int counter = 1;
        while (counter < 100) {
            counter++;
            System.out.println(counter);
        }
    }

    public static int isNumberEqualsTen(int x) {
        if (x == 10) {
            return 1;
        } else {
            return 0;
        }
    }
}

