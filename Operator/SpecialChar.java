package Operator;
import java.util.Scanner;
public class SpecialChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.print("Enter a char :");
          char ch = sc.next().charAt(0);
          
          String op = ((ch>=48 && ch<=57)|| (ch>=65 && ch<=90)|| (ch>=97 && ch<=122))?
          (ch + " is not a Special Chareter"):
          (ch + " is a Special Chareter");
          
          System.out.println(op);
    }
}