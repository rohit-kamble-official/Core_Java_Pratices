package Arrays;

import java.util.Arrays;

public class rightShiftKrotaion {

    public static void reverse(int arr[], int start, int end) {

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};

        int n = arr.length;  
        int k = 1;

        k = k % n;

        reverse(arr, 0, n - 1);   // reverse whole array
        reverse(arr, 0, k - 1);   // reverse first k elements
        reverse(arr, k, n - 1);   // reverse remaining elements;  

        System.out.println(Arrays.toString(arr));         
    }
}
        
//[5 4 3 2 1]
//[5 4 3 2 1]
//[5 1 2 3 4]