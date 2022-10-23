package ru.otus.homeworks.hw02;

import java.util.Scanner;
/* ПОДНАТАСКАТЬ
Задание на усложнение:
1. ОК / Все в один массив
2. ОК / Чтобы были цифры вместо букв
3. ОК / Разное количество вариантов ответа
4. ОК / Массив с разным типом данных
5. OK / Второй фор с j
6. Массив с увеличением элементов вне этой домашки
7. OK / Задания в лс отус
8. ОК / Первый цикл на while Второй на форич (в следующий раз)
Для себя:
1.pull-request чз IDEA
2. пересмотреть предпоследний урок
 */
public class Homework {
    static final int ZERO = 0;
    static int answer;
    static String answerNumber;
    static Scanner scanner = new Scanner(System.in);
    static int counter = 0;

    public static void main(String[] args) {
        String[][] questionsAndAnswers = {
                {"Кем разрабатывался язык Java?", "\nЧему равно ускорение свободного падения?", "\nЧто такое десница?"},
                {"1 Джеймс Гослинг", "2 Ди Каприо", "3 Архимед", "4 Железный Человек"},
                {"1 15", "2 9,8", "3 5"},
                {"1 Рука", "2 Нога", "3 Бровь", "4 Глаз", "Голова"},
                {String.valueOf(1), String.valueOf(2), String.valueOf(1)}
        };
        int wrongAnswersCount = 0;
        int rightAnswersCount = 0;

        System.out.println("Вам необходимо сдать тест, в котором " + questionsAndAnswers[ZERO].length + " вопроса.\n");
        while (counter < questionsAndAnswers[ZERO].length) {
            System.out.println(questionsAndAnswers[ZERO][counter] + "\nВарианты ответов:");
            counter++;
            for (String arr: questionsAndAnswers[counter]) {
                System.out.print(arr + "\n");
            }
            System.out.println("Ваш ответ:");
            answer = choice(questionsAndAnswers);
            counter--;
            answerNumber = String.valueOf(answer);
            if (answerNumber.equals(questionsAndAnswers[4][counter])) {
                System.out.println("Верно");
                rightAnswersCount++;
            } else {
                System.out.println("Неправильно");
                wrongAnswersCount++;
            }
            counter++;
        }
        System.out.println("Количество верных ответов:" + rightAnswersCount + "\nКоличество неверных ответов:" + wrongAnswersCount);
    }

    public static int choice(String[][] questionsAndAnswers) {
        answer = scanner.nextInt();
        while (answer < 1 || answer > questionsAndAnswers[counter].length) {
            System.out.println("Введите вариант ответа от 1 до " + questionsAndAnswers[counter].length);
            answer = scanner.nextInt();
        }
        return answer;
    }
}