package ru.otus.homeworks.hw03;


import static ru.otus.homeworks.hw03.Test.scanner;


class Student {
    private static String name;

    public static void setName() {
        while (!scanner.hasNext("[А-Яа-я]+")) {
            System.out.println("Вы ввели некорректное имя");
            scanner.next();
        }
        //здесь
    }

    public static String getName() {
        return name;
    }
}