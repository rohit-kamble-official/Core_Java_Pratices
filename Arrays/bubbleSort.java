package Arrays;

import java.util.Arrays;

public class bubbleSort {
    public static void bubleSort(int arr[]){
        
        int n = arr.length;
        boolean isSwap = false;
        for(int i = 0 ;i<n-1; i++){
            for(int j = 0 ;j<n-1-i;j++){
                if(arr[j] > arr[j+1]){
 // swap
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                   isSwap = true;
                }
            }
            if(!isSwap){
                break;
            }
        }
    };

    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1,6};
        bubleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
