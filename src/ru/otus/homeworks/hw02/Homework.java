package ru.otus.homeworks.hw02;
import java.util.Scanner;

public class Homework {
    static String answer;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int rightAnswersCount = 0;
        int wrongAnswersCount = 0;
        String[] questions = {"Кем разрабатывался язык Java?", "\nЧему равно ускорение свободного падения?", "\nЧто такое десница?"};
        String[][] answers = {{"A: Джеймс Гослинг", "B: Ди Каприо", "C: Архимед", "D: Железный Человек"}, {"A: 15", "B: 9,8", "C: 5", "D: 25"}, {"A: Рука", "B: Нога", "C: Бровь", "D: Глаз"}};
        String[] rightAnswers = {"A", "B", "A"};

        System.out.println("Вам необходимо сдать тест, в котором 3 вопроса.\nВ каждом вопросе 4 варианта ответа и лишь один из них верный.\n");
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i] + "\nВарианты ответов:");
            for (int t = 0; t < answers[i].length; t++) {
                System.out.print(answers[i][t] + "\n");
            }
            System.out.println("Ваш ответ:");
            answer = choice();
            if (answer.equalsIgnoreCase(rightAnswers[i])) {
                System.out.println("Верно");
                rightAnswersCount++;
            } else {
                System.out.println("Неправильно");
                wrongAnswersCount++;
            }
        }
        System.out.println("Количество верных ответов:" + rightAnswersCount + "\nКоличество неверных ответов:" + wrongAnswersCount);
    }
    public static String choice() {
        answer = scanner.next();
        while (!answer.equalsIgnoreCase("A") && !answer.equalsIgnoreCase("B") && !answer.equalsIgnoreCase("C") && !answer.equalsIgnoreCase("D")) {
            System.out.println("Нужно выбрать из вариантов \"A\" \"B\" \"C\" или \"D\"");
            answer = scanner.next();
        }
        return answer;
    }
}