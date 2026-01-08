
import java.util.Scanner;
public class Inputvalues{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the First Number :");
        int a = input.nextInt();
        System.out.print("Enter Second Number:");
        int b = input.nextInt();
         int sum = a+b;
         System.out.println("Total "+ sum );
    }  
}