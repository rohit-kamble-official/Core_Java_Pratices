package Test_1;
import java.util.Scanner;
public class SwitchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Char : ");
        char ch = sc.next().toLowerCase().charAt(0);
     
        switch (ch) {
            case 'a','e','i','o','u': System.out.println(ch + "is a vowel");
                
                break;
        
            default: System.out.println(ch + " is a consonent");
                break;
        }

    }
}
