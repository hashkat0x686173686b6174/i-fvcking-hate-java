import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class is designed to calculate the number of crates required to carry a
 * specific number of bottles.
 * Each crate can carry up to 6 bottles. The program prompts the user to input
 * the number of bottles and
 * displays the number of crates needed. It includes conditions to exit the
 * program based on user input
 * and the number of executions.
 *
 * @author Leon Kiefer
 * @version 1.0
 */
public class I2E {

    /**
     * The main method that initiates the crate calculation program. It handles user
     * inputs and outputs the result to the console. It includes error handling for
     * incorrect inputs and implements task conditions for program flow control.
     *
     * @param args Command-line arguments (not used here).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int executionCount = 0;

        while (true) {
            try {
                System.out.print("Bottle count (Enter 0 to exit): ");
                int bottles = scanner.nextInt();

                if (bottles == 0) {
                    System.out.println("[Info]\t Program exited.");
                    break;
                }

                int crates = calculateCrates(bottles);
                System.out.println("You need " + crates + " crate" + (crates != 1 ? "s" : "") + "!");

                // Task b condition
                if (bottles == 99 || crates == 0) {
                    break;
                }

                // Task c condition
                executionCount++;
                if (executionCount == 3) {
                    System.out.println("[Success]\t Program has been executed 3 times.");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("[Error]\t Invalid input, please enter a number.");
                scanner.next(); // Clear the invalid input
            }
        }

        scanner.close();
    }

    /**
     * This method calculates the number of crates required to carry a given number
     * of bottles, assuming each crate can carry 6 bottles.
     *
     * @param bottles The number of bottles to be transported.
     * @return The number of crates needed to carry the bottles.
     */
    private static int calculateCrates(int bottles) {
        int crates = 0;
        while (bottles > 0) {
            bottles -= 6;
            crates++;
        }
        return crates;
    }
}
