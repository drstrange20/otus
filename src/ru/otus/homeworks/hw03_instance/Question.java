package ru.otus.homeworks.hw03_instance;

public class Question{
    private final String question;

    public Question(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return this.question;
    }
}
