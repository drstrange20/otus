package ru.otus.homeworks.hw03.instance;

import java.util.InputMismatchException;
import java.util.Scanner;

class Student {
    private String name;

    private int answer;

    public void setName(Scanner scanner) {
        while (scanner.hasNextLine()) {
            try {
                name = scanner.next("[а-яА-Я]+");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Введите корректное имя");
                name = scanner.nextLine();
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setAnswer(Scanner scanner, Object[][] test1, int counter) {
        while (true) {
            try {
                answer = Integer.parseInt(scanner.nextLine().trim());
                if (answer < 1 || answer > test1[counter].length) {
                    System.out.println("Выберите вариант ответа от 1 до " + test1[counter].length);
                    setAnswer(scanner, test1, counter);
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Выберите вариант ответа от 1 до " + test1[counter].length);
            }
        }
    }

    public int getAnswer() {
        return answer;
    }
}