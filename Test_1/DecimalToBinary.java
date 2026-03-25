package Test_1;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int n = num;
        String binary = ""; // ✅ Empty string, no trailing space

        if (num == 0) {
            System.out.println("Binary = 0");
            return;
        }

        while (n > 0) {
            int rem = n % 2; // ✅ Modulo 2 for binary
            binary = rem + binary;
            n /= 2;
        }
        System.out.println("Binary = " + binary);
    }
}