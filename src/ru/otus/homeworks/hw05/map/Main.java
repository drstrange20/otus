package ru.otus.homeworks.hw05.map;

//Домашнее задание
//        Работа со счетами клиента банка
//
//        Цель:
//        Применяем на практике навыки управления equals.
//
//        Описание/Пошаговая инструкция выполнения домашнего задания:
//        У нас есть банк, в котором хранятся золотые монеты.
//        У банка есть клиенты у которых есть имя и нам как банку важно знать их возраст для ограничений
//        на операции.
//        У одного клиента может быть несколько счетов на которых хранятся золотые монеты.
//        Нужно реализовать следующую функциональность:
//
//        Найти все счета по клиенту (например List getAccounts(Client client))
//        Найти клиента по счету (например Client findClient(Account account))
//        Поиск должен работать максимально быстро(!!!) с использованием стандартных коллекций Java.
//        В классах Client и Account должно быть минимальное кол-во полей, достаточное для этой задачи.

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Рахимьянов Айнур Радикович", 28);
        Account account1 = new Account(new ArrayList<>());
        account1.setBankAccounts(543);
        account1.setBankAccounts(654);

        Client client2 = new Client("Иванов Иван Иванович", 36);
        Account account2 = new Account(new ArrayList<>());
        account2.setBankAccounts(678);

        HashMap<Client, Account> bank = new HashMap<>();
        bank.put(client1, account1);
        bank.put(client2, account2);
    }

    static void getAccounts(Client client) {

    }

    static void findClient(Account account) {

    }
}