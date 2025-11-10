// Write a Java program that simulates an ATM PIN verification system.
// The program should have a correct PIN stored (for example, 1234) and allow the user up to three attempts to enter the correct PIN.
// If the user enters the correct PIN, print "Access Granted" and stop the program.
// If the user enters the wrong PIN, print "Incorrect PIN, try again".
// After three incorrect attempts, print "Account locked".

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        final int correctPin = 1234;
        Scanner scanner = new Scanner(System.in);

        for (int attempts = 1; attempts <= 3; attempts++) {
            System.out.print("Enter PIN: ");
            int enteredPin = scanner.nextInt();
            if (enteredPin == correctPin) {
                System.out.println("Access Granted");
                scanner.close();
                return;
            } else {
                if (attempts < 3) {
                    System.out.println("Incorrect PIN, try again");
                } else {
                    System.out.println("Account locked");
                }
            }
        }
        scanner.close();
    }
}