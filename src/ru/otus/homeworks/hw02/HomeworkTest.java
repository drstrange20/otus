package ru.otus.homeworks.hw02;

import java.util.Scanner;

import static java.lang.System.in;

public class HomeworkTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int s = scanner.nextInt();
        while (scanner.hasNextInt()) {
            s = scanner.nextInt();
        }
        System.out.println(s);
    }
}