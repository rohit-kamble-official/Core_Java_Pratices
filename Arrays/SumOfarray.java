package Arrays;

public class SumOfarray {
    
    public static void printSumandAverage(int arr[]) {

        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }

        double avg = (double) sum / arr.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40};
        printSumandAverage(arr);
    }
}