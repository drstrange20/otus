package ru.otus.homeworks.hw05_map;

import java.util.ArrayList;

public class Account {
    private ArrayList<Integer> bankAccounts;

    public Account() {

        bankAccounts = new ArrayList<>();
    }
    public void addAccount (Integer integer) {
        bankAccounts.add(integer);
    }

    public ArrayList<Integer> getBankAccounts() {

        return bankAccounts;
    }
    public Integer getAccountNumber() {

        return bankAccounts.get(0);
    }

}