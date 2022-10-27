package ru.otus.homeworks.hw02;
import java.util.Scanner;

public class Test {
    static int answer;
    static int counter = 0;

    public static void main(String[] args) {
        final Object[][] QUESTIONS_AND_ANSWERS = {
                {"Кем разрабатывался язык Java?", "\nЧему равно ускорение свободного падения?", "\nЧто такое десница?"},
                {"1 Джеймс Гослинг", "2 Ди Каприо", "3 Архимед", "4 Железный Человек"},
                {"1 15", "2 9,8", "3 5"},
                {"1 Рука", "2 Нога", "3 Бровь", "4 Глаз", "5 Голова"},
                {1, 2, 1}
        };
        int wrongAnswersCount = 0;
        int rightAnswersCount = 0;

        System.out.println("Вам необходимо сдать тест, в котором 3 вопроса.\n");

        while (counter < QUESTIONS_AND_ANSWERS[0].length) {
            System.out.println(QUESTIONS_AND_ANSWERS[0][counter] + "\nВарианты ответов:");
            counter++;

            for (Object arr : QUESTIONS_AND_ANSWERS[counter]) {
                System.out.print(arr + "\n");
            }
            System.out.println("Ваш ответ:");
            answer = chooseAnOption(QUESTIONS_AND_ANSWERS);
            counter--;

            if (QUESTIONS_AND_ANSWERS[4][counter].equals(answer)) {
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

    public static int chooseAnOption(Object[][] QUESTIONS_AND_ANSWERS) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                answer = Integer.parseInt(scanner.nextLine().trim());
                while (answer < 1 || answer > QUESTIONS_AND_ANSWERS[counter].length) {
                    System.out.println("Выберите вариант ответа от 1 до " + QUESTIONS_AND_ANSWERS[counter].length);
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Выберите вариант ответа от 1 до " + QUESTIONS_AND_ANSWERS[counter].length);
            }
        }
        return answer;
    }
}