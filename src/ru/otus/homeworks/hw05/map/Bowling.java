package ru.otus.homeworks.hw05.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Bowling {
    private final HashMap<String, Integer> players;

    Bowling() {

        players = new HashMap<>();
    }

    public HashMap<String, Integer> getPlayers() {
        return players;
    }

    public void addPlayer(String name, int p) {

        players.put(name, p);
    }

    public void getWinner(HashMap<String, Integer> hashMap) {
        String key = Collections.max(hashMap.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println(key);
    }
}