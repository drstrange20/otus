package ru.otus.homeworks.hw02;

public class Exercise04 {
    public static void change(Human str) {
        System.out.println(str.name);
        str.setName("new name");
        System.out.println(str.name);
    }

    public static void main(String[] args) {
        Human str = new Human("name");
        change(str);
        System.out.println(str.name);
    }
}
class Human {
    String name;
    public Human(String name) {
        this.name = name;
    }

    public String setName(String name) {
        return this.name = name;
    }
}
