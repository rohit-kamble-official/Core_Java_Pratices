package Operator;
import java.util.Scanner;
public class Appercase {
  public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    System.out.print("Enter A char :");
    char ch = sc.next().charAt(0);

    String op =
    ((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))?
    ((ch>='A' && ch<='Z'))?
    (ch + " is a UPPER CASE APLPHABET"):
    (ch + " is a LOWER CASE APLPHABET"):
    (ch + " is not a Alphbete");
    System.out.println(op);
  }  
  
}
