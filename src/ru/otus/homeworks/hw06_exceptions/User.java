package ru.mysite.otus.hw05_exceptions;

import java.util.Scanner;

public class User {
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String verifyUserName() throws Exception {
        System.out.println("Введите Ваше имя");
        Scanner scanner = new Scanner(System.in);
        String name;
        try {
            name = scanner.next("[А-Яа-я]+");
            if (name == null) {
                throw new Exception("Вы ввели некорректное имя");
            }
        } catch (Exception e) {
            throw new Exception("Приложение не может быть запущено");
        }
        return name;
    }
}