package ru.otus.homeworks.hw05_map;

import java.util.*;
//В каждой ветке - одна домашка
//Вернуть key, а не ново созданного клиента
//Наименование не hashmap
//статик hashmap?
public class Bank {
    private static HashMap<Client, Account> hashMap;

    public Bank() {

        hashMap = new HashMap<>();
    }

    public void putToHashMap(Client client, Account account) {

        hashMap.put(client, account);
    }

    public static void main(String[] args) {
        makeBankBase();

        Client client = new Client("Петров Иван Григорьевич", 2001);
        Account account = getAccounts(client);
        if (account == null) {
            System.out.println("Счета по данному клиенту не найдены.");
        } else {
            System.out.println("Найдены следующие счета:\n" + account.getBankAccounts());
        }

        Account testAccount = new Account();
        testAccount.addAccount(124);
        Client testClient = findClient(testAccount);
        if (testClient.fullName() == null) {
            System.out.println("Клиент по данному счету не найден.");
        } else {
            System.out.println("Клиент найден!\nФИО: " + testClient.fullName() + ", дата рождения: " + testClient.birthDate());
        }
    }

    static Account getAccounts(Client client) {
        System.out.println("Поиск счетов по клиентской базе...");
        return hashMap.get(client);
    }

    static Client findClient(Account account) {
        String name = null;
        int birthDate = 0;
        System.out.println("Поиск клиента по номеру счета...");

        for (Map.Entry<Client, Account> entry : hashMap.entrySet()) {
            Client key = entry.getKey();
            Account value = entry.getValue();
            for (Integer integer : value.getBankAccounts()) {
                if (account.getBankAccounts().get(0).equals(integer)) {
                    name = key.fullName();
                    birthDate = key.birthDate();
                    break;
                }
            }
        }
        return new Client(name, birthDate);
    }


    private static void makeBankBase() {
        Client client1 = new Client("Рахимьянов Айнур Радикович", 1994);
        Client client2 = new Client("Рахимьянов Айнур Радикович", 2000);
        Client client3 = new Client("Петров Иван Григорьевич", 2001);

        Account account1 = new Account();
        account1.addAccount(123);
        account1.addAccount(124);
        account1.addAccount(125);

        Account account2 = new Account();
        account2.addAccount(126);
        account2.addAccount(127);

        Account account3 = new Account();
        account3.addAccount(128);
        account3.addAccount(129);

        Bank bank = new Bank();
        bank.putToHashMap(client1, account1);
        bank.putToHashMap(client2, account2);
        bank.putToHashMap(client3, account3);
    }
}