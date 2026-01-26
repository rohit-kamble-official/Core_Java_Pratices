
package Operator;
import java.util.Scanner;
public class ApperCaseLowecseSpecial {
  public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    System.out.print("Enter A char :");
    char ch = sc.next().charAt(0);

    String op =
    ((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))?
    ((ch>='A' && ch<='Z'))?
    (ch + " is a UPPER CASE APLPHABET"):
    (ch + " is a LOWER CASE APLPHABET"):
    ((ch>=47 && ch<=57))?
    (ch + " is a Digit"):
    (ch + " is a special Character");


    System.out.println(op);
  }  
  
}
