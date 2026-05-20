package PraticesAllQuestions;
import java.util.Scanner;

public class EvenDigitsSumProduct {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter a value : ");
       int num = sc.nextInt();
       int EvenSum = 0 ; int OddSum = 1 ;

         while (num!=0) {
            int last = num%10;
                
            if (last%2==0) {
                EvenSum+=last;
            } else{
                OddSum*=last;
            }
            num = num/10;
         }

         if (EvenSum==OddSum) {
            System.out.println("Same ");
         } else{
            System.out.println("Not same ");
         }
    }
}
