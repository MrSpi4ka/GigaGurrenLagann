package Stepik;

import static Stepik.StepikSevenOne.userInput;

public class StepikEightTwo {
    public static void main(String[] args) {

        System.out.println("\nProgram 8.2.1");
        task1();
        System.out.println("\nProgram 8.2.2");
        task2();
    }

    private static void task1(){
        System.out.println("Set the rows and columns: ");
        int n = userInput.nextInt();
        int m = userInput.nextInt();
        int[][] sampleArray = new int[n][m];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                sampleArray[i][j] = userInput.nextInt();
            }
        }
        System.out.println("Two dimensional array output");
        for (int i = 0; i <sampleArray.length; i++) {
            for (int j = 0; j <sampleArray[i].length; j++) {
                System.out.printf("%4d", sampleArray[i][j]);
            }
            System.out.println();
        }
    }

   private static void task2(){
       System.out.println("Set the rows and columns: ");
       int n = userInput.nextInt();
       int m = userInput.nextInt();
       int[][] sampleArray = new int[n][m];
       for (int i = 0; i <n; i++) {
           for (int j = 0; j <m; j++) {
               sampleArray[i][j] = userInput.nextInt();
           }
       }

       System.out.println("Two dimensional array output");
       for (int i = 0; i <sampleArray.length; i++) {
           for (int j = 0; j <sampleArray[i].length; j++) {
               System.out.printf("%4d", sampleArray[i][j]);
           }
           System.out.println();
       }

       System.out.println("Output of the transposed matrix");
       int[][] transArray = new int[m][n];
       for (int i = 0; i <n; i++) {
           for (int j = 0; j <m; j++) {
               transArray[j][i] = sampleArray[i][j];
           }
       }
       for (int i = 0; i <m; i++) {
           for (int j = 0; j <n; j++) {
               System.out.printf("%4d", transArray[i][j]);
           }
           System.out.println();
       }
   }
}
