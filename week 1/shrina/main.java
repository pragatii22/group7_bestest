import java.util.Scanner;

public class main  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        for(int i=1; i<=number; i++){
            if((i%4==0)){
                continue;
            } else {
                System.out.println(i);
            }
        }
    }
    
}
