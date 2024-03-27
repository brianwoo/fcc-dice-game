package com.fcc.dicegame.dice;

import java.util.concurrent.ThreadLocalRandom;

public class Dice implements Comparable<Dice> {

    private int faceNum = 1;

    public Dice() {}

    public Dice(int faceNum) {
        this.faceNum = faceNum;
    }


    /**
     * Method: roll
     * Generate a random dice number from 1 - 6
     * @return the newly generated number
     */
    public int roll() {
        faceNum = ThreadLocalRandom.current().nextInt(1, 6 + 1);
        return faceNum;
    }

    public int getFaceNum() {
        return faceNum;
    }


    /**
     * This method helps sorting of the dice from lowest to highest faceNum
     * @param d the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Dice d) {
        if(faceNum == d.faceNum)
            return 0;
        else if(faceNum < d.faceNum)
            return -1;
        else
            return 1;
    }


    // Quick tests - no time for jUnit tests.
//    public static void main(String[] args) {
//        Dice dice1 = new Dice(1);
//        Dice dice2 = new Dice(3);
//        Dice dice3 = new Dice(5);
//        Dice dice4 = new Dice(5);
//
//        System.out.println(dice1.compareTo(dice2));
//        System.out.println(dice3.compareTo(dice1));
//        System.out.println(dice3.compareTo(dice4));
//    }

}
