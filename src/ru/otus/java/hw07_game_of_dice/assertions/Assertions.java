package ru.otus.java.hw07_game_of_dice.assertions;

import ru.otus.java.hw07_game_of_dice.game.app.service.Player;

public class Assertions {
    public static void assertEqualsLessOne(int expected, int actual) {
        if (actual < expected) {
            throw new AssertionError("На кубике выпало значение меньше 1, выпало: " + actual);
        }
    }

    public static void assertEqualsMoreSix(int expected, int actual) {
        if (actual > expected) {
            throw new AssertionError("На кубике выпало значение больше 6, выпало: " + actual);
        }
    }

    public static void assertEquals(Player actual, Player expected) {
        if (!(actual == expected)) {
            throw new AssertionError("Неверно определен победитель " + expected + " = " + actual);
        }
    }
}