package ru.otus.homeworks.hw02;

import java.util.Arrays;
import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Количество элементов в массиве array " + array.length + "\nСколько элементов хотите добавить?");
        int count = scanner.nextInt();
        int[] newArray = Arrays.copyOf(array, count + array.length);
        System.out.println("Введите новые элементы");
        for (int i = 5; i < newArray.length; i++) {
            newArray[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(newArray));
    }
}