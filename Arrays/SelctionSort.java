package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelctionSort {
    public static void selctionSort(int arr[]){
        int n = arr.length;

        for(int i = 0 ;i<n-1;i++){
            int min = i;
            for(int j = i+1 ; j<n ;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            if(min!=i){
                // Swap
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }

            }
        }
        public static void main(String[] args){
            int arr[] = {5,4,3,2,1};
            selctionSort(arr);
          System.out.println(Arrays.toString(arr));
        }
    }

