package ru.otus.java.hw07_game_of_dice.game.tests.test1.unit;

import ru.otus.java.hw07_game_of_dice.assertions.Assertions;
import ru.otus.java.hw07_game_of_dice.game.app.service.DiceImpl;

public class DiceTest {
    public void DiceTest() {
        String scenario = "Тест на проверку значений кубика";
        try {
            int actual = new DiceImpl().roll();
            Assertions.assertEqualsLessOne(1, actual);
            Assertions.assertEqualsMoreSix(6, actual);

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());

        }
    }
}