package ru.otus.homeworks.hw03;

class Student {
    private final String name;

    int answer;

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public Student(String name) {
        this.name = name;
    }


    public String getName() {

        return name;
    }
}