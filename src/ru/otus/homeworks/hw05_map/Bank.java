package ru.otus.homeworks.hw05_map;

import java.util.*;
// возвращать результат из методов и main печатать
public class Bank {
    public static void main(String[] args) {
        Client client1 = new Client("Рахимьянов Айнур Радикович", 1994);
        Client client2 = new Client("Рахимьянов Айнур Радикович", 2000);
        Client client3 = new Client("Петров Иван Григорьевич", 2001);

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList<Integer> arrayList3 = new ArrayList<>();

        arrayList1.add(123);
        arrayList1.add(124);
        arrayList1.add(125);

        arrayList2.add(126);
        arrayList2.add(127);

        arrayList3.add(128);
        arrayList3.add(129);

        HashMap<Client, ArrayList<Integer>> hashMap = new HashMap<>();
        hashMap.put(client1, arrayList1);
        hashMap.put(client2, arrayList2);
        hashMap.put(client3, arrayList3);

//        ArrayList<Integer> clientsAccount = getAccounts(hashMap);
//        if (clientsAccount == null) {
//            System.out.println("Счета по данному клиенту не найдены");
//        } else {
//            System.out.println("Найдены следующие счета:\n" + clientsAccount);
//        }

        findClient(hashMap);
    }

    static ArrayList<Integer> getAccounts(HashMap<Client, ArrayList<Integer>> hashMap) {
        System.out.println("Поиск счетов по клиентской базе");
        Client client = new Client("Петров Иван Григорьевич", 2001);
        return hashMap.get(client);

    }


    static void findClient(HashMap<Client, ArrayList<Integer>> hashMap) {
        System.out.println("Поиск клиента по номеру счета");
        int accountNumber = 129;

        for (HashMap.Entry<Client, ArrayList<Integer>> entry : hashMap.entrySet()) {
            Client key = entry.getKey();
            ArrayList<Integer> value = entry.getValue();
            for (Integer integer: value) {
                if (accountNumber == integer) {
                    new Client(key.getFullName(), key.getBirthDate());
                }
            }
        }
    }
}