package ru.otus.java.hw07_game_of_dice.game2.test.fake;

import ru.otus.java.hw07_game_of_dice.game2.app.service.Dice;

public class DiceIntOneStub implements Dice {
    @Override
    public int roll() {
        return 1;
    }
}
