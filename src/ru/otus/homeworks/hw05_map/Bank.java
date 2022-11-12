package ru.otus.homeworks.hw05_map;

import java.util.*;

// вопрос System.out.println(hashMap.get("String" + client));

public class Bank {
    public static void main(String[] args) {
        Client client1 = new Client("Айнур Р", 28);
        Client client2 = new Client("Айнур Б", 25);
        Client client3 = new Client("Иван", 46);

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList<Integer> arrayList3 = new ArrayList<>();

        arrayList1.add(123);
        arrayList1.add(124);

        arrayList2.add(125);

        arrayList3.add(126);

        HashMap<Client, ArrayList<Integer>> hashMap = new HashMap<>();
        hashMap.put(client1, arrayList1);
        hashMap.put(client2, arrayList2);
        hashMap.put(client3, arrayList3);

        getAccounts(hashMap);
        findClient(hashMap);
    }

    static void getAccounts(HashMap<Client, ArrayList<Integer>> hashMap) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Поиск счетов по клиентской базе\nВведите ФИО клиента:");
        String clientsName = scanner.nextLine();
        System.out.println("Введите возраст:");
        int age = scanner.nextInt();

        Client client = new Client(clientsName, age);
        System.out.println(hashMap.get(client));
    }


    static void findClient(HashMap<Client, ArrayList<Integer>> hashMap) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Поиск клиента по номеру счета\nВведите номер счета:");
        int age = scanner.nextInt();

        ArrayList<Client> key = new ArrayList<>(hashMap.keySet());
        ArrayList<ArrayList<Integer>> valuesArrayList = new ArrayList<>(hashMap.values());
        for (ArrayList<Integer> accounts : valuesArrayList) {
            for (int i = 0; i < accounts.size(); i++) {
                if (age == accounts.get(i)) {
                    System.out.println("Счет принадлежит клиенту: " + key.get(i));
                }
            }
        }
    }
}
//    0     1    0    1
//{{123, 124}{125}{126}}
//        0      1    2