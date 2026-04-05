package Arrays;

public class Traversalarray {

    public static void traversal(int arr[]) {

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {20, 30, 40, 50, 60};
        traversal(arr);
    }
}