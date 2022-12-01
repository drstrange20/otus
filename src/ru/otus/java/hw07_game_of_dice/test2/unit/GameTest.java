package ru.otus.java.hw07_game_of_dice.test2.unit;

import ru.otus.java.hw07_game_of_dice.game1.app.service.*;
import ru.otus.java.hw07_game_of_dice.test2.fake.DiceImplStub;
import ru.otus.java.hw07_game_of_dice.test2.fake.GameWinnerConsolePrinterSpy;

public class GameTest {
    public void testTheDice() {
        String scenario = "Тест на проверку корректного определения победителя";
        try {
            Dice diceStub = new DiceImplStub();
            GameWinnerPrinter winnerPrinterSpy = new GameWinnerConsolePrinterSpy();
            Game game = new Game(diceStub, winnerPrinterSpy);
            game.playGame(new Player("Айнур1"), new Player("Айнур2"));

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());

        }
    }
}