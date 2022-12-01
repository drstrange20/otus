package ru.otus.java.hw07_game_of_dice.test2;


import ru.otus.java.hw07_game_of_dice.game1.test.unit.DiceTest;
import ru.otus.java.hw07_game_of_dice.test2.unit.GameTest;

public class AllTests {
    /*
        Заготовка для ДЗ представляет собой игру в кости.
        При вызове game.playGame(), два игрока кидают кости.
        Выигрывает игрок, у кого результат (1-6) больше

        Написать тесты (минимум 4) на классы DiceImpl и Game.
        Тесты должны найти не менее двух ошибок.

        Информацию о пройденном тесте предлагается выводить в System.out, а об упавшем в System.err
     */
    public static void main(String[] args) {
        new DiceTest().DiceTest();
        new GameTest().testTheDice();
    }
    
}