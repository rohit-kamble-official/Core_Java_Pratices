package Arrays;

public class CheckArraySort {
    
    public static void main(String[] args){

        int arr[] = {-7,-9,-11,1,19};
        boolean isSorted = true;

        for(int i = 0 ; i<arr.length-1;i++){
          
           if(arr[i] > arr[i+1]){     // (7>9)
            isSorted = false;
            break;
           }
            
        }
        System.out.print(isSorted);

    }



}
