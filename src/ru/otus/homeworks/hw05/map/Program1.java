package ru.otus.homeworks.hw05.map;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Bowling game = new Bowling();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            String input = scanner.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);
        }
        game.getWinner(game.getPlayers());
    }
}