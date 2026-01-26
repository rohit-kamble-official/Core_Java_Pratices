package Operator;
import java.util.Scanner;

public class CheckAlphabetOrDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Char : ");
        char ch = sc.next().charAt(0);

        String op =
                (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)?
                         (ch + " is an Alphabet"):
                         (ch >= 48 && ch <= 57) ?
                            ( ch + " is a Digit"):
                            (ch + " is a Special Character");

        System.out.println(op);
        sc.close();
    }
}
