package ru.otus.homeworks.hw02;

import java.util.Scanner;

/* 1. ПОДНАТАСКАТЬ
   2. ДАТЬ КОММЕНТАРИИ на код.

Задание на усложнение:
1. ОК - Все в один массив
2. ОК - Чтобы были цифры вместо букв
3. ОК - Разное количество вариантов ответа
4. ОК - Массив с разным типом данных
5. OK - Массив с увеличением элементов вне этой домашки
7. OK - 4 Exercises
8. ОК - Первый цикл на while, второй на for each
 */
public class Test {
    static int answer;
    static int counter = 0;

    public static void main(String[] args) {
        final String[][] QUESTIONS_AND_ANSWERS = {
                {"Кем разрабатывался язык Java?", "\nЧему равно ускорение свободного падения?", "\nЧто такое десница?"},
                {"1 Джеймс Гослинг", "2 Ди Каприо", "3 Архимед", "4 Железный Человек"},
                {"1 15", "2 9,8", "3 5"},
                {"1 Рука", "2 Нога", "3 Бровь", "4 Глаз", "5 Голова"},
                {String.valueOf(1), String.valueOf(2), String.valueOf(1)}
        };
        int wrongAnswersCount = 0;
        int rightAnswersCount = 0;

        System.out.println("Вам необходимо сдать тест, в котором 3 вопроса.\n");
        while (counter < QUESTIONS_AND_ANSWERS[0].length) {
            System.out.println(QUESTIONS_AND_ANSWERS[0][counter] + "\nВарианты ответов:");
            counter++;
            for (String arr : QUESTIONS_AND_ANSWERS[counter]) {
                System.out.print(arr + "\n");
            }
            System.out.println("Ваш ответ:");
            answer = chooseAnOption(QUESTIONS_AND_ANSWERS);
            counter--;
            String answerNumber = String.valueOf(answer);
            if (answerNumber.equals(QUESTIONS_AND_ANSWERS[4][counter])) {
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

    public static int chooseAnOption(String[][] questionsAndAnswers) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                answer = Integer.parseInt(scanner.nextLine().trim());
                while (answer < 1 || answer > questionsAndAnswers[counter].length) {
                    System.out.println("Введите вариант ответа от 1 до " + questionsAndAnswers[counter].length);
                    answer = Integer.parseInt(scanner.nextLine().trim());
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Выберите вариант ответа от 1 до " + questionsAndAnswers[counter].length);
            }
        }
        return answer;
    }
}