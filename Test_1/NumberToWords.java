
package Test_1;
import java.util.Scanner;

class NumberToWords {
    public static void main(String args[]) {

        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String word = "";

        for (int i = num; i != 0; i /= 10) {

            int ld = i % 10;

            switch (ld) {
                case 0: word = "Zero " + word; break;
                case 1: word = "One " + word; break;
                case 2: word = "Two " + word; break;
                case 3: word = "Three " + word; break;
                case 4: word = "Four " + word; break;
                case 5: word = "Five " + word; break;
                case 6: word = "Six " + word; break;
                case 7: word = "Seven " + word; break;
                case 8: word = "Eight " + word; break;
                case 9: word = "Nine " + word; break;
            }
        }

        System.out.println(word);
    }
}


