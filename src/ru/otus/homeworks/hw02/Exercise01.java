package ru.otus.homeworks.hw02;

public class Exercise01 {
    //Метов change - void, ничего не возвращает, таким образом переменная str остается неизменной в главном методе
    //если вернуть, то значение меняется
    public static void main(String[] args) {
        String str = "str";
        str = change(str);
        System.out.println(str);
    }

    public static String change(String str) {
        System.out.println(str);
        str = "new str";
        System.out.println(str);
        return str;
    }
}
