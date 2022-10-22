package ru.otus.homeworks.hw02;
import java.util.Scanner;
/* ПОДНАТАСКАТЬ
Задание на усложнение:
1. Все в один массив
2. Чтобы были цифры вместо букв
3. Разное количество вариантов ответа
4. Массив с разным типом данных
5. OK / Второй фор с j
6. Массив с увеличением элементов вне этой домашки
7. OK / Задания в лс отус
P.S.
Первый цикл на while Второй на форич (в следующий раз)
Для себя:
1.pull-request чз IDEA
2. пересмотреть два последних урока
 */
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
            for (int j = 0; j < answers[i].length; j++) {
                System.out.print(answers[i][j] + "\n");
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