package ru.otus.homeworks.hw03;

class Student {
    private static String name;

    public void setName(String name) {
        Student.name = name;
    }

    public static String getName() {
        return name;
    }
}
