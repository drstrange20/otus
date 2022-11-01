package ru.otus.homeworks.hw03;


public class RightAnswers {
    int rightAnswers;

    @Override
    public boolean equals(Object obj) {
        Student student = (Student) obj;
        return this.rightAnswers == student.answer;
    }

    public RightAnswers(int rightAnswers) {
        this.rightAnswers = rightAnswers;
    }
}