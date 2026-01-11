package Operator;
import java.util.Scanner;
public class FahrenheitToCelesius {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the value of F :");
       float F = input.nextFloat();
       float cel = (F - 32) * 5 / 9;
       System.out.println("Your temp is :"+cel);




    }


}
