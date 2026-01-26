package Operator;
import java.util.Scanner;


public class Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  Char : ");
          char ch = sc.next().charAt(0);
                      // Upper Case              // Lower Case
          String op = ((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))?(ch+ " is a Alphabet"):(ch+ " is not a Alphabet");
          System.out.println(op);
    }

}

