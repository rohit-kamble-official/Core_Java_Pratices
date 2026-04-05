package Arrays;

public class Searching {
    
    public static int linearSearch(int arr[], int key){

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i; // return index
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 5, 50};
        int key = 5;

        int ans = linearSearch(arr, key);

        if (ans != -1) {
            System.out.println("Element found at index " + ans);
        } else {
            System.out.println("Element not found");
        }
    }
}