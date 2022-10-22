package ru.otus.homeworks.hw02;

public class Exercise03 {
    public static void change(int str) {
        System.out.println(str);
        str = 1;
        System.out.println(str);
    }

    public static void main(String[] args) {
        int str = 0;
        change(str);
        System.out.println(str);
    }
}
