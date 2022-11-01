package ru.otus.homeworks.hw03;

import java.util.Scanner;

class Test {
    static int counter;

    static Exam startTesting(Object[][] test1, Student student, Scanner scanner) {
        int rightAnswersCount = 0;
        int wrongAnswersCount = 0;
        while (counter < test1[0].length) {
            System.out.println(test1[0][counter] + "\nВарианты ответов:");
            counter++;

            for (Object arr : test1[counter]) {
                System.out.print(arr + "\n");
            }
            System.out.println("Ваш ответ:");
            int answer = chooseAnOption(test1, scanner);
            student.setAnswer(answer);
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
        return new Exam(rightAnswersCount, wrongAnswersCount);
    }

    public static int chooseAnOption(Object[][] test1, Scanner scanner) {
        int answer;
        while (true) {
            try {
                answer = Integer.parseInt(scanner.nextLine().trim());
                while (answer < 1 || answer > test1[counter].length) {
                    System.out.println("Выберите вариант ответа от 1 до " + test1[counter].length);
                    answer = Integer.parseInt(scanner.nextLine().trim());
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Выберите вариант ответа от 1 до " + test1[counter].length);
            }
        }
        return answer;
    }
}