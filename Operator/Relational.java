package Operator;
import java.util.Scanner;

public class Relational {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
         
        System.out.println("Welcome to Driving License Portal");
        System.out.print("Enter Your Age :");
        int Age = input.nextInt();

        if(Age>=18){
          System.out.println("You can Drive");
        } else{
            System.out.println("You can't Drive");
        }

    }



}
