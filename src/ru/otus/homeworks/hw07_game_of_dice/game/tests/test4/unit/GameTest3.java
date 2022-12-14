package ru.otus.homeworks.hw07_game_of_dice.game.tests.test4.unit;

import ru.otus.homeworks.hw07_game_of_dice.game.app.service.Dice;
import ru.otus.homeworks.hw07_game_of_dice.game.app.service.Game;
import ru.otus.homeworks.hw07_game_of_dice.game.app.service.GameWinnerPrinter;
import ru.otus.homeworks.hw07_game_of_dice.game.app.service.Player;
import ru.otus.homeworks.hw07_game_of_dice.assertions.Assertions;
import ru.otus.homeworks.hw07_game_of_dice.game.tests.test4.fake.DiceImplStub;
import ru.otus.homeworks.hw07_game_of_dice.game.tests.test4.fake.GameWinnerConsolePrinterSpy;
import ru.otus.java.hw07_game_of_dice.game.app.service.*;
import ru.otus.java.hw07_game_of_dice.game.tests.test4.fake.*;

public class GameTest3 {
    public void gamePlayersTest3() {
        String scenario = "Тест на проверку корректного определения победителя при равных значениях на кубике";
        try {
            Dice diceStub = new DiceImplStub();
            GameWinnerPrinter winnerPrinterSpy = new GameWinnerConsolePrinterSpy();
            Player player1 = new Player("Айнур1");
            Player player2 = new Player("Айнур2");

            Game game = new Game(diceStub, winnerPrinterSpy);
            game.playGame(player1, player2);
            Assertions.assertEquals(GameWinnerConsolePrinterSpy.winner, null);
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}