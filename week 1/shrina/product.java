 public class product {
    public static void main(String[] args) {
        int sumOfEvenNumbers = 0;
        int productOfOddNumbers = 1;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) { 
                sumOfEvenNumbers += i; 
            } else {
                productOfOddNumbers *= i;
            }
        }

        System.out.println("Sum of even numbers between 1 and 10: " + sumOfEvenNumbers);
        System.out.println("Product of odd numbers between 1 and 10: " + productOfOddNumbers);
    }
}
    

