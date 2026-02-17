package Test_1;
import java.util.Scanner;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Values : ");
        int num = sc.nextInt();
        int Even = 0;
        int Odd = 0;
        while (num>0) {
            int digit = num%10;
            if (digit%2==0) {
                Even+=digit;
            } else{
                Odd+=digit;
        }
        num = num/10;
    }
    System.out.println("Even sum " + Even);
    System.out.println("Odd sum " + Odd);
}
}