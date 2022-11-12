package ru.otus.homeworks.hw02_testsystem;

public class Exercise02 {
    public static void main(String[] args) {
        String str1 = new String("str");
        String str2 = new String("str");
        String str3 = str2;
        System.out.println(str1.equals(str2));
        System.out.println(str3.equals(str2));

        str1 = "str";
        str2 = "str";
        str3 = str2;
        System.out.println(str1.equals(str2));
        System.out.println(str3.equals(str2));
    }
}