package CustomList;

import java.util.List;

public class ListRun {
    public static void main(String[] args) {
       CustomListImplementation<Integer> myList = new CustomListImplementation<>();


       myList.add(2);
       myList.add(1);
       myList.add(3);
       myList.add(8);
       myList.add(4);
       myList.add(7);
       myList.add(5);
       myList.add(0);
       myList.add(9);
       myList.add(6);

       myList.selectionSort();

       myList.displayList();

//       myList.printElementsOfArray();

    }
}
