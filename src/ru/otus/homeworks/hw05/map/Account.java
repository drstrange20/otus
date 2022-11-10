package ru.otus.homeworks.hw05.map;

import java.util.List;
import java.util.Objects;

public class Account {
    private final List<Integer> bankAccounts;

    public Account(List<Integer> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public void setBankAccounts(int accountNo) {
        this.bankAccounts.add(accountNo);
    }

    public List<Integer> getBankAccounts() {
        return bankAccounts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        return Objects.equals(bankAccounts, account.bankAccounts);
    }

    @Override
    public int hashCode() {
        return bankAccounts != null ? bankAccounts.hashCode() : 0;
    }
}