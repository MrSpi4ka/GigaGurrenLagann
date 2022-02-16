package lesson_4;

//Работа с двумерным массивом
public class DoubleArray {
    public static void main(String[] args) {
        int[][] array = new int[8][8];
        array[0][0] = 5;
        array[0][1] = 55;
        System.out.println(array[0][1] + array[0][0]);
        System.out.println(array[1][0] + array[0][0]);
    }
}
