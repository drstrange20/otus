package ru.otus.homeworks.hw03;

import java.util.Scanner;

// другие методы сканнера для приема букв и чисел
// if catch если не от 1 до 4 ошибка, потом заново заходит в while
// дженерики
// Linked list вместо массива
// a и b - 4 модификатора доступа?
// каждый вопрос вариант и правильный ответ - отдельный объект
// проверка на имя
// разбор примеров с каждого занятия
public class Exam {
    private int rightAnswersCount;
    private int wrongAnswersCount;

    Exam(int rightAnswersCount, int wrongAnswersCount) {
        this.rightAnswersCount = rightAnswersCount;
        this.wrongAnswersCount = wrongAnswersCount;
    }

    public int getRightAnswersCount() {

        return rightAnswersCount;
    }

    public int getWrongAnswersCount() {

        return wrongAnswersCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Test test = new Test();

        System.out.println("Добро пожаловать на экзамен, введите Ваше имя:");
        String name = scanner.nextLine();
        Student student = new Student(name);
        System.out.println(student.getName() + ", Вам необходимо сдать тест, в котором 3 вопроса.\n");
        Exam result = test.startTesting();
        System.out.println("Количество верных ответов:" + result.getRightAnswersCount() + "\nКоличество неверных ответов:" + result.getWrongAnswersCount());
    }
}