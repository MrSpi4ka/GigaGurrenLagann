package ru.metadevs.ivan;

import CustomList.CustomListImplementation;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Benchmark)
public class CustomListAsymptoticTest {

    Integer book = 1984;
    CustomListImplementation<Integer> myList;


    @Param({"1001", "10001", "100001"})
    public int iterations;

    @Benchmark
    public void addOfElement() {
        myList = new CustomListImplementation<Integer>();
        for (int i = 0; i < iterations - 1; i++) {
            myList.add(book);
        }
    }

    @Benchmark
    public void addByIndex() {
        myList = new CustomListImplementation<Integer>();
        for (int i = 0; i < iterations - 1; i++) {
            myList.add(iterations, book);
        }
    }

    @Benchmark
    public void addAndRemove() {
        myList = new CustomListImplementation<Integer>();
        for (int i = 0; i < iterations - 1; i++) {
            myList.add(book);
        }
        for (int i = 0; i < iterations - 1; i++) {
            myList.remove(0);
        }
    }
}
