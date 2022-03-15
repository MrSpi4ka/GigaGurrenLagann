package LessonFourDifficulty;

import java.util.Scanner;

public class LessonFourN1Dif {
    public static void main(String[] args) {
        Scanner getFact = new Scanner(System.in);
        int fact = getFact.nextInt();
        deployFact(fact);
        System.out.println("Output on display: " + deployFact(fact));

    }

    public static int deployFact(int n) {
        int calcFact = 1;
        for (int i = 1; i <=n; i++) {
            calcFact = calcFact * i;
        }
        return calcFact;
    }
}
