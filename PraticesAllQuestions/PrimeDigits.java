package PraticesAllQuestions;

import java.util.Scanner;

public class PrimeDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        while (num != 0) {
            int last = num % 10;

            if (last == 2 || last == 3 || last == 5 || last == 7) {
                System.out.println(last + " is Prime Digit");
            }

            num = num / 10;
        }

        sc.close();
    }
}




