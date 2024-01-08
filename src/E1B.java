import java.util.Scanner;

public class E1B {
    public static void main(String[] args) {
        // include scanner for reading input
        Scanner scanner = new Scanner(System.in);

        int ein; // declare variable

        System.out.println("Geben Sie eine Zahl zwischen 3 und 6 ein:");

        ein = scanner.nextInt();

        if (ein >= 3 && ein <= 6) {
            for (int hor = 1; hor <= ein; hor++) {
                String out = "";
                for (int vert = hor; vert <= ein; vert++) {
                    out += "*";
                }
                System.out.println(out);
            }
        } else {
            System.err.println("Achtung, falsche Eingabe!");
        }

        System.out.println("und fertig!");
        scanner.close();
    }
}


