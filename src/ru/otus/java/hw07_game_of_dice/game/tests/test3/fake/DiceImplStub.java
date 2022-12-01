package ru.otus.java.hw07_game_of_dice.game.tests.test3.fake;

import ru.otus.java.hw07_game_of_dice.game.app.service.Dice;

public class DiceImplStub implements Dice {
    private boolean isFirstInputCall = true;
    @Override
    public int roll() {
        if (isFirstInputCall) {
            isFirstInputCall = false;
            return 2;
        }
        return 1;
    }
}