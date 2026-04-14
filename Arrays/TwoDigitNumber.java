package Arrays;

public class TwoDigitNumber {
    

    public static int twoDigitNumber(int arr[]){

          for(int i = 0 ;i<arr.length ; i++){

           if(arr[i] >= 10 && arr[i] <= 99) {      
                System.out.println(arr[i]);        
            }
          }
          return -1 ;

    }
    public static void main(String[] args) {
        int arr[] = { 12, 2,3, 4,13,29,101};
        twoDigitNumber(arr);
    }
}
