package Operator;
import java.util.Scanner;
public class Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Char :");
        char ch = sc.next().charAt(0);


        String op = ((ch>='0' && ch<='9'))?(ch + " is a Digit"):(ch + " is not a digit");
       System.out.println(op);
    }
}
