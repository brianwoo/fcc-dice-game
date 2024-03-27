package com.fcc.dicegame.dice;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class DiceList {

    private static final int NO_SCORE_DICE = 3;
    private List<Dice> diceList = new LinkedList<>();

    public DiceList(int numOfDice) {
        generateList(numOfDice);
    }

    public DiceList(List<Dice> diceList) {
        this.diceList = diceList;
    }

    /**
     * Method; generateList
     * @param numOfDice - we want to generate
     */
    private void generateList(int numOfDice) {

        for (int i=0; i < numOfDice; i++) {
            Dice dice = new Dice();
            diceList.add(dice);
        }
    }

    /**
     * Method: removeNoScoreDice
     * @return if no score dice are found and removed, return true,
     * false otherwise
     */
    public boolean removeNoScoreDice() {
        return diceList.removeIf(d -> d.getFaceNum() == NO_SCORE_DICE);
    }

    /**
     * Method: removeLowestScoreDice
     * @return the removed (the lowest score) dice
     */
    public Dice removeLowestScoreDice() {
        Collections.sort(diceList);
        return diceList.removeFirst();
    }

    /**
     * Method: rollAllDice
     * All dice in the list are rolled, sorted by lowest number to highest
     */
    public void rollAllDice() {
        diceList.forEach(Dice::roll);
        Collections.sort(diceList);
    }

    /**
     * Method: isEmpty*
     * @return true if DiceList is empty, false otherwise.
     */
    public boolean isEmpty() {
        return diceList.isEmpty();
    }

    public void print() {
        diceList.forEach(dice -> System.out.print(dice.getFaceNum() + ", "));
        System.out.println("");
    }


    // Quick tests - no time for jUnit tests.
//    public static void main(String[] args) {
//        Dice dice1 = new Dice(5);
//        Dice dice2 = new Dice(1);
//        Dice dice3 = new Dice(3);
//        Dice dice4 = new Dice(5);
//
//        List<Dice> myDiceList = new LinkedList<Dice>(Arrays.asList(dice1, dice2, dice3, dice4));
//        DiceList diceList = new DiceList(myDiceList);
//
//        Dice lowestScoreDice = diceList.removeLowestScoreDice();
//        diceList.print();
//        System.out.println("lowestScoreDice: " + lowestScoreDice.getFaceNum());
//
//        boolean isRemoved = diceList.removeNoScoreDice();
//        System.out.println("isRemoved: " + isRemoved);
//        diceList.print();
//
//        isRemoved = diceList.removeNoScoreDice();
//        System.out.println("isRemoved again: " + isRemoved);
//        diceList.print();
//
//        DiceList diceList2 = new DiceList(8);
//        diceList2.print();
//        diceList2.rollAllDice();
//        diceList2.print();
//    }

}
