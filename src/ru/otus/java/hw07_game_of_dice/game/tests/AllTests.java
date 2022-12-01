package ru.otus.java.hw07_game_of_dice.game.tests;


import ru.otus.java.hw07_game_of_dice.game.tests.test1.unit.*;
import ru.otus.java.hw07_game_of_dice.game.tests.test2.unit.GameTest;
import ru.otus.java.hw07_game_of_dice.game.tests.test3.unit.GameTest2;

public class AllTests {
    public static void main(String[] args) {
        new DiceTest().DiceTest();
        new GameTest().testTheDice();
        new GameTest2().testTheDice();
    }
    
}