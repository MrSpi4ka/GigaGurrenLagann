package CustomList;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;



class CustomListImplementationTest {

    @Test
    void shouldAddElementByInedxToList() {
        CustomListImplementation<String> myList = new CustomListImplementation<>();

        myList.add(0,"Meta");

        assertThat(myList.get(0)).isEqualTo("Meta");
    }

    @Test
    void shouldRemoveElementByInedxFromList() {
        CustomListImplementation<Integer> myList = new CustomListImplementation<>();

        myList.add(0,345);

        assertThat(myList.remove(0)).isEqualTo(345);
    }

    @Test
    void checkListSizeForNumbersOfElements() {
        CustomListImplementation<Integer> myList = new CustomListImplementation<>();

        myList.add(345);

        assertThat(myList.size()).isEqualTo(1);
    }

    @Test
    void subList() {
        CustomListImplementation<Integer> myList = new CustomListImplementation<>();
        List<Integer> mySubList;

        Integer numberOne = 234;
        Integer numberTwo = 123;
        Integer numberThree = 24;
        Integer numberFour = 834;

        myList.add(numberOne);
        myList.add(numberTwo);
        myList.add(numberThree);
        myList.add(numberFour);

        mySubList = myList.subList(1,3);

        assertThat(mySubList.size()).isEqualTo(2);
        assertThat(mySubList.get(0)).isEqualTo(123);
    }

    @Test
    void isTheArrayIsEmpty() {
        CustomListImplementation<Integer> myList = new CustomListImplementation<>();

        assertThat(myList.isEmpty()).isEqualTo(true);
    }

    @Test
    void contains() {
        CustomListImplementation<String> myList = new CustomListImplementation<>();

        myList.add("Ivan");

        assertThat(myList.contains("Ivan")).isEqualTo(true);
        assertThat(myList.contains("Michael")).isEqualTo(false);
    }
}