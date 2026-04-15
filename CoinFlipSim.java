import java.util.Random;

public class CoinFlipSim {

    public static void main(String[] args) {
        int numFlips = 10000; // 10000 coin flips
        int headsCount = 0; // Counter for heads
        int tailsCount = 0; // Counter for tails

        Random random = new Random();

        // Simulate coin flips
        for (int i = 0; i < numFlips; i++) {
            if (random.nextBoolean()) {
                headsCount++; // INcrease heads count
            } else {
                tailsCount++; // Increase tails count
            }
        }

        System.out.println("Total Flips: " + numFlips); //number of flips, should always be 10,000
        System.out.println("Heads: " + headsCount); //counts heads
        System.out.println("Tails: " + tailsCount); //counts tails
        System.out.println("Expected Percentage of Heads: 50%"); //since its a coin flip, should be 50/50
        System.out.println("Actual Percentage of Heads: " + (headsCount / (double) numFlips * 100) + "%"); //actual percent of heads
        System.out.println("Actual Percentage of Tails: " + (tailsCount / (double) numFlips * 100) + "%"); //actual percent of tails

        System.out.println("Absolute Error: " + Math.abs(50 - (headsCount / (double) numFlips * 100)) + "%"); //absolute error
    }

    /*
    This program similates a coin flip by using the Random import.
    The simulation runs for 10,000 flips and counts number of heads and tails
    Than the program calculates number of heads and tails, the percent of heads,
    the expected pereent, and the absolute error.
    */
}