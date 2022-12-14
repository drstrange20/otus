package ru.otus.homeworks.hw07_game_of_dice.game.tests.test3.unit;

import ru.otus.homeworks.hw07_game_of_dice.assertions.Assertions;
import ru.otus.homeworks.hw07_game_of_dice.game.app.service.Dice;
import ru.otus.homeworks.hw07_game_of_dice.game.app.service.Game;
import ru.otus.homeworks.hw07_game_of_dice.game.app.service.GameWinnerPrinter;
import ru.otus.homeworks.hw07_game_of_dice.game.app.service.Player;
import ru.otus.homeworks.hw07_game_of_dice.game.tests.test3.fake.DiceImplStub;
import ru.otus.homeworks.hw07_game_of_dice.game.tests.test3.fake.GameWinnerConsolePrinterSpy;

public class GameTest2 {
    public void gamePlayersTest2() {
        String scenario = "Тест на проверку корректного определения победителя, когда Player1 > Player2";
        try {
            Dice diceStub = new DiceImplStub();
            GameWinnerPrinter winnerPrinterSpy = new GameWinnerConsolePrinterSpy();
            Game game = new Game(diceStub, winnerPrinterSpy);
            Player player1 = new Player("Айнур1");
            Player player2 = new Player("Айнур2");

            game.playGame(player1, player2);
            Assertions.assertEquals(GameWinnerConsolePrinterSpy.winner, player1);
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());

        }
    }
}