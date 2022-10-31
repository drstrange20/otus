package ru.otus.homeworks.hw03;

import java.util.Scanner;
//??? простой массив литералов из объектов

// другие методы сканнера для приема букв и чисел
// if catch если не от 1 до 4 ошибка, потом заново заходит в while
// дженерики
// Linked list вместо массива
// a и b - 4 модификатора доступа?
// проверка на имя
// разбор примеров с каждого занятия
public class Exam {
    private static int rightAnswersCount;
    private static int wrongAnswersCount;

    Exam(int rightAnswersCount, int wrongAnswersCount) {
        Exam.rightAnswersCount = rightAnswersCount;
        Exam.wrongAnswersCount = wrongAnswersCount;
    }

    public int getRightAnswersCount() {

        return rightAnswersCount;
    }

    public int getWrongAnswersCount() {

        return wrongAnswersCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Question firstQuestion = new Question("Кем разрабатывался язык Java?");
        Question secondQuestion = new Question("Чему равно ускорение свободного падения?");
        Question thirdQuestion = new Question("Что такое десница?");

        Answer firstAnswers1 = new Answer("1 Джеймс Гослинг");
        Answer firstAnswers2 = new Answer("2 Ди Каприо");
        Answer firstAnswers3 = new Answer("3 Архимед");
        Answer firstAnswers4 = new Answer("4 Железный Человек");

        Answer secondAnswers1 = new Answer("1 15");
        Answer secondAnswers2 = new Answer("2 9,8");
        Answer secondAnswers3 = new Answer("3 5");

        Answer thirdAnswers1 = new Answer("1 Рука");
        Answer thirdAnswers2 = new Answer("2 Нога");
        Answer thirdAnswers3 = new Answer("3 Бровь");
        Answer thirdAnswers4 = new Answer("4 Глаз");
        Answer thirdAnswers5 = new Answer("5 Голова");

        RightAnswers firstRightAnswer = new RightAnswers(1);
        RightAnswers secondRightAnswer = new RightAnswers(2);
        RightAnswers thirdRightAnswer = new RightAnswers(1);

        Object[][] test1 = {
                {firstQuestion, secondQuestion, thirdQuestion},
                {firstAnswers1, firstAnswers2, firstAnswers3, firstAnswers4},
                {secondAnswers1, secondAnswers2, secondAnswers3},
                {thirdAnswers1, thirdAnswers2, thirdAnswers3, thirdAnswers4, thirdAnswers5},
                {firstRightAnswer, secondRightAnswer, thirdRightAnswer},
        };
        System.out.println(firstRightAnswer);
        System.out.println(test1[4][1]);
        System.out.println(test1[4][2]);
        System.out.println("Добро пожаловать на экзамен, введите Ваше имя:");
        String name = scanner.nextLine();
        Student student = new Student(name);
        System.out.println(student.getName() + ", Вам необходимо сдать тест, в котором 3 вопроса.\n");
        Exam result = Test.startTesting(test1, student);
        System.out.println("Количество верных ответов:" + result.getRightAnswersCount() + "\nКоличество неверных ответов:" + result.getWrongAnswersCount());
    }
}