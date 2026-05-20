package Test_1;

public class ArmstrongGeneral {
    public static void main(String[] args) {

        int num = 1634;
        int temp = num;

        // Step 1: count digits
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Step 2: calculate sum
        temp = num;
        int sum = 0;

        while (temp > 0) {
            int last = temp % 10;

            int power = 1;
            for (int i = 1; i <= count; i++) {
                power *= last;
            }

            sum += power;
            temp /= 10;
        }

        

        // Step 3: check
        if (sum == num) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}