package Stepik;

import java.util.Scanner;

public class StepikSix {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String pathChoice;
        pathChoice = userInput.next();
        switch (pathChoice) {
            case "l":
                System.out.println("коня потеряешь, себя спасёшь!\n");
                break;
            case "f":
                System.out.println("и себя и коня потеряешь!\n");
                break;
            case "r":
                System.out.println("себя потеряешь, коня спасёшь!\n");
                break;
            default:
                System.out.println("Такого пути нет");
        }

    }
}
