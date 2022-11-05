package ru.otus.homeworks.hw03;
// другие методы сканнера для приема букв и чисел
import java.util.Scanner;

public class Test {
    private final int rightAnswersCount;
    private final int wrongAnswersCount;

    Test(int rightAnswersCount, int wrongAnswersCount) {
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
        Question firstQuestion = new Question("Кем разрабатывался язык Java?");
        Question secondQuestion = new Question("Чему равно ускорение свободного падения?");
        Question thirdQuestion = new Question("Что такое десница?");

        Answers firstAnswers1 = new Answers("1 Джеймс Гослинг");
        Answers firstAnswers2 = new Answers("2 Ди Каприо");
        Answers firstAnswers3 = new Answers("3 Архимед");
        Answers firstAnswers4 = new Answers("4 Железный Человек");

        Answers secondAnswers1 = new Answers("1 15");
        Answers secondAnswers2 = new Answers("2 9,8");
        Answers secondAnswers3 = new Answers("3 5");

        Answers thirdAnswers1 = new Answers("1 Рука");
        Answers thirdAnswers2 = new Answers("2 Нога");
        Answers thirdAnswers3 = new Answers("3 Бровь");
        Answers thirdAnswers4 = new Answers("4 Глаз");
        Answers thirdAnswers5 = new Answers("5 Голова");

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

        System.out.println("Добро пожаловать на экзамен, введите Ваше имя:");
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        student.setName(scanner);

        System.out.println(student.getName() + ", Вам необходимо сдать тест, в котором 3 вопроса.\n");
        Test result = startTesting(test1, student, scanner);
        System.out.println("Количество верных ответов:" + result.getRightAnswersCount() + "\nКоличество неверных ответов:" + result.getWrongAnswersCount());
    }
    static Test startTesting(Object[][] test1, Student student, Scanner scanner) {
        int counter = 0;
        int rightAnswersCount = 0;
        int wrongAnswersCount = 0;
        while (counter < test1[0].length) {
            System.out.println(test1[0][counter] + "\nВарианты ответов:");
            counter++;

            for (Object arr : test1[counter]) {
                System.out.print(arr + "\n");
            }
            System.out.println("Ваш ответ:");
            student.setAnswer(scanner, test1, counter);
            counter--;

            if (test1[4][counter].equals(student)) {
                System.out.println("Верно");
                rightAnswersCount++;
            } else {
                System.out.println("Неправильно");
                wrongAnswersCount++;
            }
            counter++;
        }
        return new Test(rightAnswersCount, wrongAnswersCount);
    }
}