package Methods;

public class sumofEvenNumber {

    public static int evenSum(int start, int end) {
        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int start = 1;
        int end = 30;

        System.out.println(evenSum(start, end));
    }
}