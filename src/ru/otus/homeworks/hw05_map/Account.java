package ru.otus.homeworks.hw05_map;

import java.util.ArrayList;

public class Account {
    private final ArrayList<Integer> BANKACCOUNTS;

    public Account() {

        BANKACCOUNTS = new ArrayList<>();
    }
    public void addAccount (int integer) {
        BANKACCOUNTS.add(integer);
    }

    public ArrayList<Integer> getBankAccounts() {

        return BANKACCOUNTS;
    }

}