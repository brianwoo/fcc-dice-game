
import com.fcc.dicegame.gameboard.GameSimulator;
import com.fcc.dicegame.gameboard.ScoreBoard;


public class Main {

    public static void main(String[] args) {

        GameSimulator gSim = new GameSimulator();
        long start = System.currentTimeMillis();

        ScoreBoard scores = gSim.simulate(10000, 2);
        scores.printScores();

        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println("Total simulation took " + (timeElapsed / 1000f) + " seconds.");
    }

}