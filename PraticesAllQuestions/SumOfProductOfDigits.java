package PraticesAllQuestions;
import java.util.Scanner;


public class SumOfProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        int sum = 0;
        int  prod = 1;
        
        while (num!=0) {
        //     123 ! = 0
            int last = num%10;         // L : 3 ,2 , 1
                                      
            sum = sum+last;            // S : 0+3 = 3 , 3 + 2 = 5 ,5+1 = 6 
            prod = prod*last;           // P : 1*3 = 3 , 3*2 = 6 , 6*1 = 6

            num = num/10;              // num : 0

        }
        if (sum==prod) {
            System.out.println("Sum of product are same ");
        } else{
            System.out.println("Not same ");
        }

    }
}
