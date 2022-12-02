package ru.otus.java.hw07_game_of_dice.game.tests;


import ru.otus.java.hw07_game_of_dice.game.tests.test1.DiceTest;
import ru.otus.java.hw07_game_of_dice.game.tests.test2.unit.GameTest;
import ru.otus.java.hw07_game_of_dice.game.tests.test3.unit.GameTest2;
import ru.otus.java.hw07_game_of_dice.game.tests.test4.unit.GameTest3;

public class AllTests {
    public static void main(String[] args) {
        new DiceTest().DiceValuesTest();
        new GameTest().gamePlayersTest1();
        new GameTest2().gamePlayersTest2();
        new GameTest3().gamePlayersTest3();
    }
    
}