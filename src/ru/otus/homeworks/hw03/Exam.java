package ru.otus.homeworks.hw03;


// другие методы сканнера для приема букв и чисел
// if catch если не от 1 до 4 ошибка, потом заново заходит в while
// дженерики
// Linked list
public class Exam {
    private static int wrongAnswersCount;
    private static int rightAnswersCount;

    public Exam(int rightAnswersCount, int wrongAnswersCount) {
        Exam.rightAnswersCount = rightAnswersCount;
        Exam.wrongAnswersCount = wrongAnswersCount;
    }

    public static int getRightAnswersCount() {
        return rightAnswersCount;
    }

    public static void setWrongAnswersCount(int wrongAnswersCount) {
        Exam.wrongAnswersCount = wrongAnswersCount;
    }

    public static int getWrongAnswersCount() {
        return wrongAnswersCount;
    }

    public static void main(String[] args) {

        Test test = new Test();

        System.out.println("Добро пожаловать на экзамен, введите Ваше имя:");
        Student.setName();
        System.out.println(Student.getName() + ", Вам необходимо сдать тест, в котором 3 вопроса.\n");
        Exam exam = test.startTesting();
        System.out.println("Количество верных ответов:" + getRightAnswersCount() + "\nКоличество неверных ответов:" + getWrongAnswersCount());
    }
}