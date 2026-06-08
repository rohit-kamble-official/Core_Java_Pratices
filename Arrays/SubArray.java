package Arrays;

public class SubArray {
    public static void main(String[] args){
     
        int arr[] = {1,2,3,7,5};             // 1
        int target = 12;                     // 12
        int sum = 0 , count = 0;            //  123
                                            // 1237
        for(int i = 0 ;i<arr.length; i++){   // 12375 
            sum = 0;

            for(int j = i ;j<arr.length; j++){
                sum += arr[j];
                if(sum==target){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
