package ru.otus.homeworks.hw04;


import java.util.ArrayList;
import java.util.Date;

public class Algorithm {
    public static void main(String[] args) {
        ArrayList<Byte> arrayList = new ArrayList<>();
        arrayList.add((byte) 2);
        arrayList.add((byte) 3);
        arrayList.add((byte) 5);
        arrayList.add((byte) 4);
        arrayList.add((byte) 1);
        arrayList.add((byte) 6);
        arrayList.add((byte) 7);

        System.out.println(arrayList);
        byte start = (byte) new Date().getTime();
        ArrayList arrayList1 = doSort(arrayList);
        byte end = (byte) new Date().getTime();
        System.out.println(arrayList1 + "\ndelta: " + (end - start) + " ms");

    }
    public static ArrayList doSort(ArrayList<Byte> list) {
        for (byte i = 0; i < list.size(); i++) {
            int index = (int)(Math.random() * list.size());

            byte element = list.get(i);

            list.set(i, list.get(index));
            list.set(index, element);

        }
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i+1)) {
                doSort(list);
            }
        }
            return list;
    }
}