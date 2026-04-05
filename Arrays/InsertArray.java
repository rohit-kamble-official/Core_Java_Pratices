package Arrays;

public class InsertArray {

    public static void insert(int arr[], int n, int index, int value) {

        // shift elements to right
        for(int i = n - 1; i > index; i--){    // (i = 5-1 ; i>2;n i--)        i = 3 , 
            arr[i] = arr[i - 1];                // 
        }

        // insert value
        arr[index] = value;
    }

    public static void main(String[] args) {

        int[] arr = new int[6]; // extra space
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        int n = 5; // current elements

        insert(arr, n, 2, 15);

        // print result
        for(int i = 0; i < n + 1; i++){
            System.out.print(arr[i] + " ");
        }
    }
}