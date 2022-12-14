package ru.otus.java.hw07_game_of_dice.game.app.service;

public class Game2 {

    private final DiceImpl dice;
    private final GameWinnerPrinter winnerPrinter;

    public Game2(DiceImpl dice, GameWinnerPrinter winnerPrinter) {
        this.dice = dice;
        this.winnerPrinter = winnerPrinter;
    }

    public void playGame(Player player1, Player player2) {
        int player1Result = dice.roll();
        int player2Result = dice.roll();

        Player winner = (player1Result > player2Result)? player1: player2;
        winnerPrinter.printWinner(winner);
    }
}