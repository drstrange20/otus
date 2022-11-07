package ru.otus.homeworks.hw04;

import java.util.ArrayList;
import java.util.Date;
// При количестве элементов больше 6. Отчего зависит. И если сделать обычный массив, изменится ли результат?

public class Algorithm {
    public static int x;

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(1);
        arrayList.add(0);

        System.out.println(arrayList);
        int start = (int) new Date().getTime();
        ArrayList arrayList1 = doSort(arrayList);
        int end = (int) new Date().getTime();
        System.out.println("Количество итераций: " + x++);
        System.out.println(arrayList1 + "\ndelta: " + (end - start) + " ms");

    }
    public static ArrayList doSort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int index = (int)(Math.random() * list.size());

            int element = list.get(i);

            list.set(i, list.get(index));
            list.set(index, element);

        }
        for (int j = 0; j < list.size() - 1; j++) {
            if (list.get(j) > list.get(j+1)) {
                x++;
                doSort(list);
            }
        }
            return list;
    }
}