package Operator;
import java.util.Scanner;
public class Simpleinterest {
    public static void main(String[] args){
     Scanner input =  new Scanner(System.in);
      System.out.print("Enter The value of Priciple :");
         float P = input.nextFloat();
      System.out.print("Enter The value of Time in Year :");
         float T = input.nextFloat();
      System.out.print("Enter The value of Rate :");

      Float R =  input.nextFloat();

      float Simpleinterest = (P*R*T)/100;

      System.out.println("Simple Interrest is : "+Simpleinterest);



    }
}
