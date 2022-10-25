package ru.otus.homeworks.hw02;

import java.util.Arrays;

public class DynamicArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] newArray = Arrays.copyOf(array, 6);
        System.out.println(Arrays.toString(newArray));
    }
}