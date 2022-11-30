package ru.otus.java.hw07_game_of_dice.game1.app;


import ru.otus.java.hw07_game_of_dice.game1.app.service.*;

public class Main {

    public static void main(String[] args) {
        Dice dice = new DiceImpl();
        GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter();
        Game game = new Game(dice, winnerPrinter);
        game.playGame(new Player("Вася"), new Player("Игорь"));
    }
}
