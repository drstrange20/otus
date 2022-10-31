package ru.otus.homeworks.hw03;


public class RightAnswers {
    int rightOption;

    @Override
    public boolean equals(Object obj) {
        Student student = (Student) obj;
        return this.rightOption == student.answer;
    }

    public RightAnswers(int rightOption) {
        this.rightOption = rightOption;
    }
//    RightAnswers rightAnswers = (RightAnswers) o;
//
//        if (rightOption != rightAnswers.rightOption) return false;

}