package ru.otus.java.hw07_game_of_dice.game.tests.test2.unit;

import ru.otus.java.hw07_game_of_dice.game.app.service.*;
import ru.otus.java.hw07_game_of_dice.game.tests.test2.fake.DiceImplStub;
import ru.otus.java.hw07_game_of_dice.game.tests.test2.fake.GameWinnerConsolePrinterSpy;

public class GameTest {
    public void gamePlayersTest1() {
        String scenario = "Тест на проверку корректного определения победителя, когда Player1 < Player2";
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