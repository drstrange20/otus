package ru.otus.homeworks.hw07_game_of_dice.game.tests.test2.fake;

import ru.otus.homeworks.hw07_game_of_dice.game.app.service.Dice;

public class DiceImplStub implements Dice {
    private boolean isFirstInputCall = true;
    @Override
    public int roll() {
        if (isFirstInputCall) {
            isFirstInputCall = false;
            return 1;
        }
        return 2;
    }
}