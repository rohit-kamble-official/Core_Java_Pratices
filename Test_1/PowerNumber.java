package Test_1;
import java.util.Scanner;

public class PowerNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number : ");
         double num = sc.nextDouble();
         System.out.println("Enter a power : ");
         double pow = sc.nextDouble();

         if (pow<0) {
            pow*=-1;
            num = 1/num;
         }
         double op = 1;
         for(int i = 1;i<pow;i++){
            op = op*num;

            System.out.println("user Defined : " +op);
            System.out.println("Bulid-in : " + Math.pow(num , pow));
         }
    }
}
