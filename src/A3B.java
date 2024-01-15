import java.util.Scanner;

public class A3B {
    /**
     * Returns {@code true} if the string contains only Unicode digits.
     * An empty string or {@code null} leads to {@code false}.
     *
     * @param string Input String.
     * @return {@code true} if string is numeric, {@code false} otherwise.
     */
    public static boolean isNumeric(String string) {
        if (string == null || string.isEmpty())
            return false;

        for (int i = 0; i < string.length(); i++)
            if (!Character.isDigit(string.charAt(i)))
                return false;

        return true;
    }

    public static void printNumericStatus(String test, boolean isNumeric) {
        System.out.println("Der String \"" + test + "\" ist numerisch: " + isNumeric);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.print("Bitte geben Sie ein Alter ein (oder 'ende' zum Beenden): ");
            input = scanner.nextLine();

            // Check if the user wants to end the loop
            if (input.equalsIgnoreCase("ende")) {
                break;
            }

            boolean hasOnlyDigits = isNumeric(input);
            printNumericStatus(input, hasOnlyDigits);

        } while (true);

        scanner.close();
        System.out.println("Programm beendet.");
    }
}
