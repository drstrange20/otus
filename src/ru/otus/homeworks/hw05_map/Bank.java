package ru.otus.homeworks.hw05_map;

import java.util.*;

public class Bank {
    private final HashMap<Client, Account> hashMap;

    public Bank() {
        hashMap = new HashMap<>();
    }

    public void putToHashMap(Client client, Account account) {
        hashMap.put(client, account);
    }

    public HashMap<Client, Account> getHashMap() {
        return hashMap;
    }

    public static void main(String[] args) {
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

        Account account = getAccounts(bank.getHashMap());
        if (account == null) {
            System.out.println("Счета по данному клиенту не найдены.");
        } else {
            System.out.println("Найдены следующие счета:\n" + account.getBankAccounts());
        }

//        Client client = findClient(bank.getHashMap());
//        if (client.getFullName() == null) {
//            System.out.println("Клиент по данному счету не найден.");
//        } else {
//            System.out.println("Клиент найден!\nФИО: " + client.getFullName() + ", дата рождения: " + client.getBirthDate());
//        }
    }

    static Account getAccounts(HashMap<Client, Account> hashMap) {
        System.out.println("Поиск счетов по клиентской базе...");
        Client client = new Client("Рахимьянов Айнур Радикович", 1994);
        return hashMap.get(client);
    }


    static Client findClient(HashMap<Client, Account> hashMap) {
        String name = null;
        int birthDate = 0;

        System.out.println("Поиск клиента по номеру счета...");
        Account account = new Account();
        account.addAccount(128);

        for (Map.Entry<Client, Account> entry : hashMap.entrySet()) {
            Client key = entry.getKey();
            Account value = entry.getValue();
            for (Integer integer : value.getBankAccounts()) {
                if (account.getAccountNumber().equals(integer)) {
                    name = key.getFullName();
                    birthDate = key.getBirthDate();
                    break;
                }
            }
        }
        return new Client(name, birthDate);
    }
}