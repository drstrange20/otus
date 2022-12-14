package ru.otus.homeworks.hw07_game_of_dice.game.tests.test4.fake;

import ru.otus.homeworks.hw07_game_of_dice.game.app.service.Dice;

public class DiceImplStub implements Dice {
    @Override
    public int roll() {
        return 1;
    }
}