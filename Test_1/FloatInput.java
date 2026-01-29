// Take a float value as input and print:
// Its value rounded to 2 decimal places
package Test_1;
import java.util.Scanner;

public class FloatInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Decimal Value : ");
         float a = sc.nextFloat();
         System.out.printf("Float Decimal Value : %.2f" , a);
       
    }
}
