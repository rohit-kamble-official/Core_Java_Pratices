package Test_1;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a values : ");
        // int num = sc.nextInt();
        // int reverse = 0;

        // while (num>0) {
        //     int digit = num%10;
        //     reverse = reverse * 10 + digit;
        //     num = num / 10;
        // }
        // System.out.println("reverse No : " + reverse);
          System.out.println("Enter a value : ");
          int num = sc.nextInt();
          String str =num + "";
          String rev = "";
          for(int i =0; i<str.length();i++){
            rev = str.charAt(i) + rev;
          }
          System.out.println(rev);

    }
}
