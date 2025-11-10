// import java.util.Scanner;

// 1. public class weekend {
//     public static void main(String[]args) {
//         int week = 1;
//         switch (week) {
//             case 1:
//                 System.out.println("Sunday");
//                 break;
//             case 2:
//                 System.out.println("Monday");
//                 break;
//             case 3:
//                 System.out.println("Tuesday");
//                 break;
//             case 4:
//                 System.out.println("Wednesday");
//                 break;
//             case 5:
//                 System.out.println("Thursday");
//                 break;
//             default:
//                 System.out.println("not a number");
//                 break;
        
//         }
//     }
// }



// using switch

// 2.public class weekend {
//     public static void main(String[]args) {
//         int week = 2;
//         char time = 'e';
//         switch (week) {
//             case 1:
//                 System.out.println("Sunday");
//                 break;
//             case 2:
//                 System.out.println("Monday");
//                 switch (time) {
//                     case 'm':
//                         System.out.println("morning");
//                         break;
//                     case 'a':
//                         System.out.println("afternoon");
//                         break;
//                     case 'e':
//                         System.out.println("evening");
//                         break;
//                     default:
//                         break;
                    

//                 }
//                 break;
//             case 3:
//                 System.out.println("Tuesday");
//                 break;
//             case 4:
//                 System.out.println("Wednesday");
//                 break;
//             case 5:
//                 System.out.println("Thursday");
//                 break;
//             default:
//                 System.out.println("not a number");
//                 break;
        
//         }
//     }
// }

// 3. public class weekend {
//     public static void main(String[]args) {
//         Scanner sc = new Scaneer(System.in);
//         System.out.println("Enter the week");
//         int week = sc.nextInt();
//         System.out.println("Enter the time");
//         char time = SC.nextline().charAt(0);
//         switch (week) {
//             case 1:
//                 System.out.println("Sunday");
//                 break;
//             case 2:
//                 System.out.println("Monday");
//                 switch (time) {
//                     case 'm':
//                         System.out.println("morning");
//                         break;
//                     case 'a':
//                         System.out.println("afternoon");
//                         break;
//                     case 'e':
//                         System.out.println("evening");
//                         break;
//                     default:
//                         break;
                    

//                 }
//                 break;
//             case 3:
//                 System.out.println("Tuesday");
//                 break;
//             case 4:
//                 System.out.println("Wednesday");
//                 break;
//             case 5:
//                 System.out.println("Thursday");
//                 break;
//             default:
//                 System.out.println("not a number");
//                 break;
        
//         }
//     }
// }





// 4. public class weekend {
//     public static void main(String[]args) {
//         int a = 5;
//         if (a<8){
//             System.out.println("hello");
        
//         }else if (a == 0){
//             System.out.println("Hi");

//         }else{
//             System.out.println("hi Hi");
//         }
//     }
// }


// 5. public class weekend{
//     public static void main(String[] args) {
//         String name= "Gyanu";
//         String name1 = "Gyanu";
//         if (name== name1){
//             System.out.println("Hello");
//         }
//         else{
//             System.out.println("bye");
//         }

//     }
// }



// using nested if
// 6. public class weekend {
//     public static void main(String[] args) {
//         String username="new";
//         int password=12345;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter your username");
//         String username1=sc.nextLine();
//         System.out.println("enter your password");
//         int password1=sc.nextInt();

//         if (username.equals(username1) & password==password1){
//             System.out.println("matched");
//         }
//         else if (username.equals(username1) || password==password1){
//             System.out.println("one matched");
//             if (username.equals(username1)){
//                 System.out.println("username matched");
//             }
//             else{
//                 System.out.println("password matched");
//             }

//         }
//         else
//         {
//             System.out.println("none matched");
//         }
//         }
  
//     }




// 7.without using nested
// public class weekend {
//     public static void main(String[] args) {
//         String username="new";
//         int password=12345;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter your username");
//         String username1=sc.nextLine();
//         System.out.println("enter your password");
//         int password1=sc.nextInt();

//         if (username.equals(username1) & password==password1){
//             System.out.println("matched");
//         }
//         else if (username.equals(username1) & password!=password1){
//             System.out.println("one matched");

//         }
//         else
//         {
//             System.out.println("none matched");
//         }
//         }
       
//     }


// for (int i=0; i<=3 ;i++)

// public class weekend {
//     public static void main(String[] args) {
//         int password=12345;
//         Scanner sc = new Scanner (System.in);
//         System.out.println("");
//         int password1=sc.nextInt();

//         if (password==password1){
//             for (int i=0; i<=3 ;i++){

//             }
//         }





//     }
// }

// public class weekend{
//     public static void main(String[]args) {
//         for (int i=1; i<=5; i++) {
//             for (int j = 1; j<=i ;j++) {
//                 System.out.println(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.Scanner;

// public class weekend {
//     public static void main(String[] args) {
//         int i = 0;
//         int password = 12345;
//         Scanner sc = new Scanner(System.in);
//         while (i<5) {
//         System.out.println("Enter your password: ");
//         int password1 = sc.nextInt();
//         if (password == password1) {
//             System.out.println("Password Matched!");
//             break;
//         }
//         else {
            
//             System.out.println("None matched!");
//         }
//         i++;

//        }
//        System.out.println("terminated");
       
//     }
// }
 

// public class weekend {
//     public static void main(String[]args) {
//         int i=0;
//         int pin=1234;
//         Scanner sc =new Scanner(System.in);
//         while (i<3){
//         System.out.println("Enter your pin:");
//         int pin1=sc.nextInt();
//         if (pin==pin1) {
//             System.out.println("Access granted");
//             break;

//         } else {
//             System.out.println("Incorrect pin,Try again");
//             i++;
//         }
//         if (i==3) {
//             System.out.println("Account locked");
//         }
       
        

        
//        }
        


//     }
// }


// 2
// public class weekend {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number: ");
//         int num = sc.nextInt();
//         for (int i = 1; i <= num; i++) {
//             if (i % 4 == 0) {
//                 continue;
//             }
//             System.out.print(i + " ");
//         }
//     }
// }



//  public class weekend {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 30; i++) {
//             if (i % 3 == 0 && i % 5 == 0) {
//                 System.out.println("FizzBuzz");
//             } else if (i % 3 == 0) {
//                 System.out.println("Fizz");
//             } else if (i % 5 == 0) {
//                 System.out.println("Buzz");
//             } 
//         }
//     }
// }  




// public class weekend {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         for (int i = 1; i <= 10; i++) {
//             System.out.print("Enter number" +i+ ": ");
//             int num = sc.nextInt();
//             if (num % 2 == 0 && num > 20) {
//                 System.out.println(num + " is even and greater than 20");
//             }
//         }
//     }
// }

// public class weekend {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 30; i++) {
//             if (i == 15) {
//                 System.out.println("skip");
//                 continue;
//             }

//             if (i % 4 == 0) {
//                 System.out.println(i * 2); 
//             } else {
//                 System.out.println(i);
//             }
//         }

//         System.out.println("done");
//     }
// } 

// public class weekend {
//     public static void main(String[] args) {
//         int even = 0;
//         int odd = 1;
//         for (int i =1; i <= 10; i++) {
//             if (i % 2 == 0) {
//                 even += i;
//             }
//             else {
//                 odd *= i;
//             }
//         }
//         System.out.println("Sum of even numbers: " + even);
//         System.out.println("Product of odd numbers: " + odd);
//     }
// }



// public class weekend {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 30; i++) {
//             if (i == 15) {
//                 System.out.println("skip");
//             }
//             else if (i % 4 == 0) {
//                 int d = i + i;
//                 System.out.println(i + " is divisible by 4 and its double is: " + d);
//             }
//             else {
//                 System.out.println(i);
//             }
//         }
//         System.out.println("done");
//     }
// }



// public class weekend{
//     public static void main(String[] args) {
//         for (int i = 2; i < 50; i++) {
//             if (i % 3 == 0 || i % 5 == 0) {
//                 System.out.print(i+ " ");
//             }
//         }
//     }
// }


// public class weekend {
//     public static void main(String[] args) {
//         System.out.println("Numbers between 1 and 50 divisible by 3 or 5, but not both:");

//         for (int i = 1; i <= 50; i++) {
//             // Check: divisible by 3 or 5, but not both
//             if ((i % 3 == 0 || i % 5 == 0) && !(i % 3 == 0 && i % 5 == 0)) {
//                 System.out.println(i);
//             }
//         }
//     }
    
// }

