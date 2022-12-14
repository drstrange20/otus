package ru.otus.homeworks.hw04_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Algorithm2 {
    public static void main(String[] args) {
        ArrayList<Integer> firstArrayList = new ArrayList<>();
        ArrayList<Integer> secondArrayList = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            int rand = (int)(Math.random() * 1000000);
            firstArrayList.add(rand);
            secondArrayList.add(rand);
        }


        int start1 = (int) new Date().getTime();
        Collections.sort(firstArrayList);
        int end1 = (int) new Date().getTime();
        System.out.println("Java Collections sort " + (end1 - start1) + " ms");

        int start = (int) new Date().getTime();
        doSortWithChoice(secondArrayList);
        int end = (int) new Date().getTime();
        System.out.println("Сортировка выбором " + (end - start) + " ms");
    }

    public static void doSortWithChoice(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size() - 1; i++) {
            int min = arrayList.get(i);
            int bufferNumber = 0;
            for (int j = i +1; j < arrayList.size(); j++) {
                if (arrayList.get(i) > arrayList.get(j)) {
                    min = arrayList.get(j);
                    bufferNumber = j;
                }
            }
            int bufferValue = arrayList.get(i);
            arrayList.set(i, min);
            arrayList.set(bufferNumber, bufferValue);
        }
    }
}