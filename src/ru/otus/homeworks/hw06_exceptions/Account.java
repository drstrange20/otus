package ru.otus.homeworks.hw06_exceptions;

public class Account {
    private int cash;

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public Account(int cash) {
        this.cash = cash;
    }
}