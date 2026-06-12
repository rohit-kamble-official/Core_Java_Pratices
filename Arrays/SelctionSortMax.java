package Arrays;
import java.util.Arrays;

public class SelctionSortMax {

    public static void selctionSort(int arr[]) {
        int n = arr.length;

        for (int i = n - 1; i > 0; i--) {
            int max = 0;

            for (int j = 1; j <= i; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }

            // Swap
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};

        selctionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}