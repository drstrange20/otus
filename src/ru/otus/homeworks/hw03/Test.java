package ru.otus.homeworks.hw03;

import java.util.Scanner;

class Test {
    final Object[][] QUESTIONS_AND_ANSWERS_ARRAY = {
            {"Кем разрабатывался язык Java?", "\nЧему равно ускорение свободного падения?", "\nЧто такое десница?"},
            {"1 Джеймс Гослинг", "2 Ди Каприо", "3 Архимед", "4 Железный Человек"},
            {"1 15", "2 9,8", "3 5"},
            {"1 Рука", "2 Нога", "3 Бровь", "4 Глаз", "5 Голова"},
            {1, 2, 1}
    };
    static int counter = 0;
    static int answer;
    static Scanner scanner = new Scanner(System.in);
    Exam startTesting() {
        int rightAnswersCount = 0;
        int wrongAnswersCount = 0;
        while (counter <QUESTIONS_AND_ANSWERS_ARRAY[0].length) {
            System.out.println(QUESTIONS_AND_ANSWERS_ARRAY[0][counter] + "\nВарианты ответов:");
            counter++;

            for (Object arr : QUESTIONS_AND_ANSWERS_ARRAY[counter]) {
                System.out.print(arr + "\n");
            }
            System.out.println("Ваш ответ:");
            answer = chooseAnOption(QUESTIONS_AND_ANSWERS_ARRAY);
            counter--;

            if (QUESTIONS_AND_ANSWERS_ARRAY[4][counter].equals(answer)) {
                System.out.println("Верно");
                rightAnswersCount++;
            } else {
                System.out.println("Неправильно");
                wrongAnswersCount++;
            }
            counter++;
        }
        return new Exam(rightAnswersCount, wrongAnswersCount);
    }


    public static int chooseAnOption(Object[][] QUESTIONS_AND_ANSWERS) {
        while (true) {
            try {
                answer = Integer.parseInt(scanner.nextLine().trim());
                while (answer < 1 || answer > QUESTIONS_AND_ANSWERS[counter].length) {
                    System.out.println("Выберите вариант ответа от 1 до " + QUESTIONS_AND_ANSWERS[counter].length);
                    answer = Integer.parseInt(scanner.nextLine().trim());
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Выберите вариант ответа от 1 до " + QUESTIONS_AND_ANSWERS[counter].length);
            }
        }
        return answer;
    }
}