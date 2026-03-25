package Test_1;

public class RangeOfTwstendPrime {
    public static void main(String[] args) {

        int start = 1;
        int end = 100;

        for (int num = start; num <= end; num++) {

            int temp = num;

            // reverse
            int rev = 0;
            int copy = num;
            while (copy > 0) {
                int last = copy % 10;
                rev = rev * 10 + last;
                copy /= 10;
            }

            // check original prime
            int count1 = 0;
            for (int i = 2; i <= temp / 2; i++) {
                if (temp % i == 0) {
                    count1++;
                }
            }

            // check reverse prime
            int count2 = 0;
            for (int j = 2; j <= rev / 2; j++) {
                if (rev % j == 0) {
                    count2++;
                }
            }

            if (count1 == 0 && count2 == 0 && temp > 1) {
                System.out.print(temp+ " ");
            }
        }
    }
}