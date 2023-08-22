import java.util.Random;

public class Test2 {

        public static void main(String[] args) {

            // Creating a random number generator
            Random randomGenerator = new Random();

            // Generate a number between 1 and 6
            int dieRoll = -1;
            // Repeat while roll isn't 5
            while(dieRoll != 5 ) {
                 dieRoll = randomGenerator.nextInt(6) + 1;
                System.out.print("\t\t"+dieRoll);
            }
        }

    }



