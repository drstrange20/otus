package ru.otus.java.hw07_game_of_dice.game2.app;

import ru.otus.java.hw07_game_of_dice.game2.app.service.*;
import ru.otus.java.hw07_game_of_dice.game2.test.fake.*;

public class Main {

    public static void main(String[] args) {
        Dice dice = new DiceIntOneStub();
        GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter();
        Game game = new Game(dice, winnerPrinter);
        game.playGame(new Player("Вася"), new Player("Игорь"));
    }
}
