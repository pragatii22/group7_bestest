 import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = new int[10];
        
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        System.out.println("Even numbers greater than 20:");
        for (int number : numbers) {
            if (number % 2 == 0 && number > 20) {
                System.out.println(number);
            }
        }
        
        scanner.close();
    }
} 
    

