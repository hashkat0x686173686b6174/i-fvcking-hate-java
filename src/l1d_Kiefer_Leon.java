import java.util.Scanner;
import java.util.Random;

public class l1d_Kiefer_Leon {
    public static void main(String[] args) {
        // Define objects
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String userChoice = null;

        do {
            int num1 = random.nextInt(101); // Generate a number between 0 and 100
            int num2 = random.nextInt(101); // Generate another number between 0 and 100
            System.out.println("Choose the arithmetic operation (+, -, *, /)");
            String operation = scanner.next();
            int correctAnswer;

            // Depending on the operation, calculate the correct answer
            switch (operation) {
                case "+":
                    correctAnswer = num1 + num2;
                    break;
                case "-":
                    correctAnswer = num1 - num2;
                    break;
                case "*":
                    correctAnswer = num1 * num2;
                    break;
                case "/":
                    // Check for division by zero with ternary operator
                    num2 = (num2 == 0) ? 1 : num2;
                    correctAnswer = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid operation.");
                    continue;
            }
            System.out.println("What does '" + num1 + " " + operation + " " + num2 + "' evaluate to?");
            float userAnswer = scanner.nextFloat();
            if (userAnswer == correctAnswer) {
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong! The correct result is " + correctAnswer);
            }
            System.out.println("Test again? [y/n]");
            userChoice = scanner.next();
        } while (userChoice != null && userChoice.equalsIgnoreCase("y"));
        System.out.println("End test");
        scanner.close();
    }
}

