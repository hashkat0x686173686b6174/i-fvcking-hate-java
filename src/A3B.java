import java.util.Scanner;

/**
 * @author Léon Kiefer
 * @version 15.01.2024 - 0.1.0
 *
 * This class contains methods to check if a string is numeric and to interact with the user.
 */
public class A3B {
    /**
     * Checks if the input string contains only Unicode digits.
     *
     * @param string The input string to check.
     * @return {@code true} if the string is numeric (only contains digits), {@code false} otherwise.
     */
    public static boolean isNumeric(String string) {
        // An empty string or null is not considered numeric, so return false.
        if (string == null || string.isEmpty())
            return false;

        // Iterate over each character in the string to check if it's a digit.
        for (int i = 0; i < string.length(); i++)
            if (!Character.isDigit(string.charAt(i)))  // If any character is not a digit, return false.
                return false;

        // If we haven't returned false by this point, the string is numeric.
        return true;
    }

    /**
     * Prints the numeric status of the input string to the console.
     *
     * @param test      The string to print the numeric status for.
     * @param isNumeric The boolean status indicating if the string is numeric or not.
     */
    public static void printNumericStatus(String test, boolean isNumeric) {
        // Print out the result in a user-friendly format.
        System.out.println("Der String \"" + test + "\" ist numerisch: " + isNumeric);
    }

    /**
     * The main method that runs the application. It repeatedly prompts the user to enter a string
     * to check if it's numeric and continues until the user types 'ende'.
     *
     * @param args The command-line arguments, which are not used in this application.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object to read user input.
        String input;  // Declare a variable to hold the user input.

        // This loop continues until the user decides to exit by entering 'ende'.
        do {
            System.out.print("Bitte geben Sie ein Alter ein oder 'ende' zum Beenden: ");
            input = scanner.nextLine();  // Read the user input.

            // Check if the user wants to end the loop by typing 'ende'.
            if (input.equalsIgnoreCase("ende"))
                break;  // If 'ende' was typed, exit the loop.

            // Call isNumeric to check if the entered string is numeric.
            boolean hasOnlyDigits = isNumeric(input);
            // Call printNumericStatus to print out whether the string is numeric or not.
            printNumericStatus(input, hasOnlyDigits);
        } while (true);  // The loop condition will always be true, so it relies on the break to exit.

        scanner.close();  // Close the scanner object to prevent resource leaks.
        System.out.println("Programm beendet.");  // Inform the user that the program has ended.
    }
}