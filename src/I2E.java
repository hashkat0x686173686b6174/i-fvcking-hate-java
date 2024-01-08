import java.util.Scanner;


// TODO: JavaDOC for Method and Class
// TODO: Try Catch for error handling and faulty input
public class I2E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int executionCount = 0;

        while (true) {
            System.out.print("Number of bottles? (Enter 0 to exit): ");
            int bottles = scanner.nextInt();
            if (bottles == 0) {
                System.out.println("Program exited.");
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
                System.out.println("Program has been executed 3 times.");
                break;
            }
        }

        scanner.close();
    }

    private static int calculateCrates(int bottles) {
        int crates = 0;
        while (bottles > 0) {
            bottles -= 6;
            crates++;
        }
        return crates;
    }
}
