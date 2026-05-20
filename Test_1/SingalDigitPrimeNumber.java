package Test_1;

public class SingalDigitPrimeNumber {
    public static void main(String[] args) {

        int start = 1;
        int end = 9;

        for (int i = start; i <= end; i++) {

            int count = 0;

            for (int num = 1; num <= i; num++) {
                if (i % num == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(i);
            }
        }
    }
}