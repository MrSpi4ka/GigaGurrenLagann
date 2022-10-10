package CustomList;

import java.util.*;


public class CustomListImplementation<T> implements List<T>{

    private T[] array;
    private int size;
    public final static int DEFAULT_CAPACITY = 20;

    public CustomListImplementation() {
        this.array = (T[]) new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public CustomListImplementation(T[] array) {
        this.array = array;
        this.size = array.length;
    }


    private T[] copyOf(T[] array, int length) {
        T[] newArray = (T[]) new Object[length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    private void increaseCapacity() {
        if (size == array.length) {
            int newLength = (int) (array.length * 1.5);
            array = copyOf(array, newLength);
        }
    }

    @Override
    public void add(int index, T element) {
        if (index > size) {
            throw new IndexOutOfBoundsException("Element is out of range");
        }
        increaseCapacity();
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = element;
        size++;
    }

    @Override
    public T remove(int index) {
        if (index < 0 && index > size) {
            throw new IndexOutOfBoundsException("Index has not found in array");
        }
        T deletedElement = array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return deletedElement;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        T[] subArray = (T[]) new Object[toIndex - fromIndex];
        int s = 0;
        for (int i = fromIndex; i < toIndex; i++) {
            subArray[s] = array[i];
            s++;
        }
        return new <T>CustomListImplementation<T>(subArray);

    }

    @Override
    public T get(int index) {
        return array[index];
    }

    @Override
    public boolean add(T element) {
        increaseCapacity();
        array[size] = element;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(o)) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    public void displayList() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
            System.out.print("");
        }
    }

    public void selectionSort() {
        int minElement;
        int comparedElem;
        int i;
        T tempElement;
        for (i = 0; i < size - 1; i++) {
            minElement = i;
            for (comparedElem = i + 1; comparedElem < size; comparedElem++) {
                if ((int) array[minElement] > (int) (array[comparedElem])) {
                    minElement = comparedElem;
                }
            }
            tempElement = array[i];
            array[i] = array[minElement];
            array[minElement] = tempElement;
        }
    }

    //region another methods to implement
    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    //endregion


}
