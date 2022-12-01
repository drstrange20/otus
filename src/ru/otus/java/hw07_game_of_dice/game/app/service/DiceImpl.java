package ru.otus.java.hw07_game_of_dice.game.app.service;

import java.util.Random;

public class DiceImpl implements Dice {
    @Override
    public int roll() {
        return new Random().nextInt();
    }
}