package Arrays;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : "); // 3
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter " + size + " element : ");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt(); // 2 , 4 , 5
        }

        int max = arr[0];
        int min = arr[0];
        int max_index = 0;
        int min_index = 0;

        for (int i = 1; i < arr.length; i++) { // [2 , 4, 5]
            if (arr[i] > max) {                   //()
                max = arr[i]; // max : 5
                max_index = i;
            }

            if (arr[i] < min) {
                min = arr[i];
                min_index = i;
            }
        }
        System.out.println("Max element = " + max + " at index = " + max_index);
        System.out.println("Min element = " + min + " at index = " + min_index);

    }

}
