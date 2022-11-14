package ru.otus.homeworks.hw05_map;

import java.util.ArrayList;

public class Account {
    private final ArrayList<Integer> bankAccounts;

    public Account() {

        bankAccounts = new ArrayList<>();
    }
    public void addAccount (int integer) {
        bankAccounts.add(integer);
    }

    public ArrayList<Integer> getBankAccounts() {

        return bankAccounts;
    }
}