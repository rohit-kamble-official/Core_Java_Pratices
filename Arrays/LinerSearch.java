package Arrays;

public class LinerSearch {
    public static void main(String[] args){
        int arr[] = {1,2,10,7,30};
        int target = 10;
        int ans = -1 , n = arr.length;


        for(int i = 0 ; i<n ; i++){
            if(arr[i] == target){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
