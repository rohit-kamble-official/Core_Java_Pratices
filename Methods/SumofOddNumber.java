package Methods;

public class SumofOddNumber {

    public static int range(int start, int end) {
        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {   // check odd
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int start = 1;
        int end = 30;

        System.out.println(range(start, end));
    }
}