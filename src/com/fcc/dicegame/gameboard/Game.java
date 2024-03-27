package com.fcc.dicegame.gameboard;

import com.fcc.dicegame.dice.Dice;
import com.fcc.dicegame.dice.DiceList;

/**
 * One single game
 */
public class Game {

    /**
     * Method: play
     * @param diceList
     * @return score of this game
     */
    public int play(DiceList diceList) {

        int totalScore = 0;

        while (!diceList.isEmpty()) {
            diceList.rollAllDice();
            boolean isAnyDiceRemoved = diceList.removeNoScoreDice();

            if (!isAnyDiceRemoved) {
                Dice removedDice = diceList.removeLowestScoreDice();
                totalScore += removedDice.getFaceNum();
            }
        }
        return totalScore;
    }

}
