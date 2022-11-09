package ru.otus.homeworks.hw03.instance;


public class RightAnswers {
    private final int rightAnswers;

    @Override
    public boolean equals(Object obj) {
        Student student = (Student) obj;
        return this.rightAnswers == student.getAnswer();
    }

    public RightAnswers(int rightAnswers) {
        this.rightAnswers = rightAnswers;
    }
}