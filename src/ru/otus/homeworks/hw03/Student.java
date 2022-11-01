package ru.otus.homeworks.hw03;

import java.util.InputMismatchException;
import java.util.Scanner;

class Student {
    private String name;
    int answer;

    public void setName(Scanner scanner) {
        while (scanner.hasNextLine()) {
            try {
                name = scanner.next("[а-яА-Я]+");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Введите корректное имя");
                scanner.nextLine();
            }
        }
    }


    public void setAnswer(int answer) {
        this.answer = answer;
    }


    public String getName() {
        return name;
    }
}