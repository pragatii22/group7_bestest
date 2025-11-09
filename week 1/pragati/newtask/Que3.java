package newtask;
public class Que3 {
    public static void main(String[] args){
        System.out.println("FizzBuzz from 1 to 50: ");
        for (int i = 1; i<=50; i++){
            if (i % 3==0 && i % 5 ==0 ){
                System.out.println("FizzBuzz");
            }
            else if (i % 3 ==0){
                System.out.println("Fuzz");

            }
            else if (i % 5 ==0){
                System.out.println("Buzz");

            }
            else {
                System.out.println(i);
            }
        }
    }
}