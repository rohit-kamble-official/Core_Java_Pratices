package Arrays;

public class BinarySearch {
    public static void main(String[] args){
        int arr[] = {1,2,12,15,18,19};
        int target = 18;
        int n= arr.length , ans = -1;
        int s = 0 , e = n-1;

        while(s < e){
            int mid = (s+e)/2;
            if(arr[mid] == target){
                ans = mid;
                break;
            } else if(arr[mid] < target){
                s = mid + 1;
            } else{
                e = mid-1;
            }
        }
            System.out.println(ans);

    }
}
