// Write a Java program that asks for 10 integers and prints only those that are 
// even and greater than 20 using if and for loops.

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            if (num > 20 && num % 2 == 0) {
                System.out.println(num);
            }
        }
        scanner.close();
    }
}