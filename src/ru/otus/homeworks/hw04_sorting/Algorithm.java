package ru.otus.homeworks.hw04_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
// Как получить ссылку на пулл реквест из идеи?
// увеличить мапять jvm
public class Algorithm {
    public static int x;

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            int rand = (int) (Math.random() * 100);
            arrayList.add(rand);
        }
        System.out.println(arrayList);

        int start = (int) new Date().getTime();
        ArrayList arrayList1 = doStupidSorting(arrayList);
        int end = (int) new Date().getTime();
        System.out.println("Количество итераций: " + x++);
        System.out.println(arrayList1 + "\ndelta: " + (end - start) + " ms");

    }

    public static ArrayList doStupidSorting(ArrayList<Integer> list) {
        x++;
        Collections.shuffle(list);
//        for (int i = 0; i < list.size(); i++) {
//            int index = (int) (Math.random() * list.size());
//
//            int element = list.get(i);
//
//            list.set(i, list.get(index));
//            list.set(index, element);
//
//        }
        for (int j = 0; j < list.size() - 1; j++) {
            if (list.get(j) > list.get(j + 1)) {
                doStupidSorting(list);
            }
        }
        return list;
    }
}