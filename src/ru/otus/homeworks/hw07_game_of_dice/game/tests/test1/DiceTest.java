package ru.otus.homeworks.hw07_game_of_dice.game.tests.test1;

import ru.otus.homeworks.hw07_game_of_dice.assertions.Assertions;
import ru.otus.homeworks.hw07_game_of_dice.game.app.service.DiceImpl;

public class DiceTest {
    public void DiceValuesTest() {
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