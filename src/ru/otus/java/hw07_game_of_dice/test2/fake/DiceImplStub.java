package ru.otus.java.hw07_game_of_dice.test2.fake;

import ru.otus.java.hw07_game_of_dice.game1.app.service.Dice;

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