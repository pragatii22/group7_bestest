// //write the java program to execute asking the user to type the correct number 12345 when the user typethe right then terminate the program. the program should run infinite times if not user correct number.
// import java.util.Scanner;

// public class CW{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int number = 12345;
//         int num;
//         while(true){
//             System.out.print("Enter a number : ");
//             num = sc.nextInt();
//             if (number == num){
//                 System.out.println("You entered the correct password");
//                 break;
//             };
        
        
//         }
//         sc.close();
//     }
// }


//write the multiplication table of 2 and skip the result  using continue

public class CW{

    public static void main(String[] args) {
        for (int i = 1; i<=10;i++){
            if (2*i==6) {
                continue;
            }else{
                System.out.println("2x"+i+"="+2*i);
            }
            
        }
    }
}