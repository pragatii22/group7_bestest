package newtask;
import java.util.Scanner;

public class Que7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int correctPin = 1234;
        int attempts = 3;

        for (int i = 1; i <= attempts; i++) {
            System.out.print("Enter a pin: ");
            int enteredPin = sc.nextInt();

            if (enteredPin == correctPin) {
                System.out.println("Access Granted");
                return; // stop the program
            } else {
                if (i < attempts) {
                    System.out.println("Incorrect pin, try again.");
                } else {
                    System.out.println("Account locked.");
                }
            }
        }
        sc.close();
    }
}