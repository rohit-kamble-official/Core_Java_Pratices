package Test_1;

public class Twistedprime {
    public static void main(String[] args) {

        int num = 11;
        int temp = num;   // store original

        // reverse
        int rev = 0;
        while (num > 0) {
            int last = num % 10;
            rev = rev * 10 + last;
            num /= 10;
        }

        // check original prime
        int count1 = 0;
        for (int i = 2; i <= temp/2; i++) {
            if (temp % i == 0) {
                count1++;
            }
        }

        // check reverse prime
        int count2 = 0;
        for (int i = 2; i <= rev/2; i++) {
            if (rev % i == 0) {
                count2++;
            }
        }

        if (count1 == 2 && count2 == 2) {
            System.out.println("Twisted Prime");
        } else {
            System.out.println("Not Twisted Prime");
        }
    }
}