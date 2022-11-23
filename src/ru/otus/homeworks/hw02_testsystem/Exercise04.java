package ru.otus.homeworks.hw02_testsystem;

public class Exercise04 {
    public static void main(String[] args) {
        Human str = new Human("name");
        change(str);
        System.out.println(str);
    }

    public static void change(Human str) {
        System.out.println(str);
        str.setName("new name");
        System.out.println(str);
    }
}

class Human {
    String name;

    Human(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}