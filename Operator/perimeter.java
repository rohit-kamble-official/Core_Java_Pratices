package Operator;
import java.util.Scanner;

public class perimeter {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);

      System.out.print("Enter the value:");
      int A = input.nextInt();

      int B = input.nextInt();
     
      int C = input.nextInt();
       
       int D = input.nextInt();
    
      int perimetesum = A+B+C+D;

      System.out.print("The Perimeter Of the reactange is :"+ perimetesum);


    }
}
    