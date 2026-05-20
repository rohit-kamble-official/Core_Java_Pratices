package Arrays;
import java.util.Scanner;

class majorityProblem {

    // Function to find majority element
    public int majorityElement(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int count = 0;

            for (int j = 0; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            // Check if element appears more than n/2 times
            if (count > nums.length / 2) {
                return nums[i];
            }
        }

        return -1;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        // Create array
        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Create object of Solution class
        majorityProblem obj = new majorityProblem();

        // Call function
        int result = obj.majorityElement(nums);

        // Print result
        System.out.println("Majority Element is: " + result);

        sc.close();
    }
}