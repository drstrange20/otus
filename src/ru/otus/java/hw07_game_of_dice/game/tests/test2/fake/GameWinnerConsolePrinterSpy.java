package ru.otus.java.hw07_game_of_dice.game.tests.test2.fake;

import ru.otus.java.hw07_game_of_dice.assertions.Assertions;
import ru.otus.java.hw07_game_of_dice.game.app.service.GameWinnerPrinter;
import ru.otus.java.hw07_game_of_dice.game.app.service.Player;

public class GameWinnerConsolePrinterSpy implements GameWinnerPrinter {
    @Override
    public void printWinner(Player winner) {
        Assertions.assertEquals(winner, new Player("Айнур2"));
    }
}
