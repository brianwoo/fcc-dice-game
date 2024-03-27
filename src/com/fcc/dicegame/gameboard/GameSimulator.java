package com.fcc.dicegame.gameboard;

import com.fcc.dicegame.dice.DiceList;

public class GameSimulator {

    /**
     * Method: simulate
     * @param numIterations
     * @param numDice
     * @return ScoreMap - Map to keep track of all the scores
     */
    public ScoreBoard simulate(int numIterations, int numDice) {

        ScoreBoard scoreBoard = new ScoreBoard();

        if (numIterations <= 0 || numDice <= 0) {
            System.out.println("numDice / numIterations cannot be <= 0");
            return scoreBoard;
        }

        for (int i=0; i < numIterations; i++) {
            DiceList diceList = new DiceList(numDice);
            Game game = new Game();
            int gameScore = game.play(diceList);
            scoreBoard.addScore(gameScore);
        }

        return scoreBoard;
    }





}
