import java.util.Scanner;

public class ATM {
    public static void main(String[]args){
        final int correctPIN = 1234;
        Scanner scanner = new Scanner(System.in);
        int pin;
        for(int attempts=1;attempts<=3;attempts++){
            System.out.print("Enter your PIN: ");

        pin=scanner.nextInt();
        if(pin==correctPIN){
            System.out.println("Access Granted");
            break;
        }else{
            if (attempts<3){
                System.out.println("Incorrect PIN. Try again.");
            }

            else{
                System.out.println("Account Locked");
            }


    }
    
    }scanner.close();
    }
}
