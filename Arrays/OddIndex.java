package Arrays;

public class OddIndex {
    

    public static void printOddIndex(int arr[]){
      
          for(int i = 1 ; i<arr.length ; i+=2){
            System.out.println(arr[i]);
          }
    }

    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6};
        printOddIndex(arr);
    }
}
