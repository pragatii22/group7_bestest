package newtask;
import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        System.out.println("Numbers from 1 to " + num + " (skipping multiples of 4):");

        for (int i = 1; i <= num; i++){
            if (i % 4 == 0) {
                continue;
            }
            System.out.println(i);
        }
        input.close();
    }
}
