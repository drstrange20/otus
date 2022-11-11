package ru.otus.homeworks.hw05.map;

import java.util.*;

// вопрос System.out.println(hashMap.get("String" + client));

public class Bank {
    public static void main(String[] args) {
        Client client1 = new Client("Айнур Р", 28);
        Client client2 = new Client("Айнур Б", 25);
        Client client3 = new Client("Иван", 46);

        ArrayList<Long> arrayList1 = new ArrayList<>();
        ArrayList<Long> arrayList2 = new ArrayList<>();
        ArrayList<Long> arrayList3 = new ArrayList<>();

        arrayList1.add(408178105555555L);
        arrayList1.add(408178106666666L);

        arrayList2.add(408178107777777L);

        arrayList3.add(408178108888888L);

        HashMap<Client, ArrayList<Long>> hashMap = new HashMap<>();
        hashMap.put(client1, arrayList1);
        hashMap.put(client2, arrayList2);
        hashMap.put(client3, arrayList3);

        getAccounts(hashMap);
        findClient(hashMap);
    }

    static void getAccounts(HashMap<Client, ArrayList<Long>> hashMap) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Поиск счетов по клиентской базе\nВведите ФИО клиента:");
        String clientsName = scanner.nextLine();
        System.out.println("Введите возраст:");
        int age = scanner.nextInt();

        Client client = new Client(clientsName, age);
        System.out.println(hashMap.get(client));
    }


    static void findClient(HashMap<Client, ArrayList<Long>> hashMap) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Поиск клиента по номеру счета\nВведите номер счета:");
        long age = scanner.nextLong();

        ArrayList<Client> key = new ArrayList<>(hashMap.keySet());
        ArrayList<ArrayList<Long>> valuesArrayList = new ArrayList<>(hashMap.values());
        for (ArrayList<Long> accounts : valuesArrayList) {
            for (int i = 0; i < accounts.size(); i++) {
                if (accounts.get(i) == age) {
                    System.out.println("Счет принадлежит клиенту: " + key.get(i));
                }
            }
        }
    }
}