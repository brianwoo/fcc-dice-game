package com.fcc.dicegame.gameboard;

import java.util.*;

public class ScoreBoard {

    private final Map<Integer, Float> scoreMap = new HashMap<>();
    private int numIterations = 0;

    /**
     * Method: addScore
     * @param scoreToAdd
     */
    public void addScore(int scoreToAdd) {

        numIterations++;

        Float numOfWins = scoreMap.get(scoreToAdd);
        if (numOfWins == null) {
            scoreMap.put(scoreToAdd, 1f);
        }
        else {
            numOfWins += 1f;
            scoreMap.put(scoreToAdd, numOfWins);
        }
    }

    /**
     * Method: printScores
     * printing the scores
     */
    public void printScores() {

        if (numIterations <= 0) {
            System.out.println("numIterations cannot be <= 0");
            return;
        }

        ArrayList<Integer> keys = new ArrayList<>(scoreMap.keySet());
        Collections.sort(keys);

        for (Integer key : keys) {
            Float score = scoreMap.get(key);
            if (score != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Total ")
                  .append(key)
                  .append(" occurs ")
                  .append(score / numIterations)
                  .append(" occurred ")
                  .append(score)
                  .append(" times.");

                String output = sb.toString();
                System.out.println(output);
            }
        }
    }


    // Quick tests - no time for jUnit tests.
//    public static void main(String[] args) {
//        ScoreMap sMap = new ScoreMap();
//        sMap.addScore(4);
//        sMap.addScore(4);
//        sMap.addScore(7);
//        sMap.addScore(22);
//        sMap.addScore(22);
//        sMap.addScore(22);
//        sMap.addScore(22);
//        sMap.printScores();
//    }

}
