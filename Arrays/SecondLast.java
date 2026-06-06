package Arrays;
import java.util.Scanner;

public class SecondLast {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
      System.out.print("Enter array Size : ");
      int size = sc.nextInt();
      int arr[] = new int[size];
      System.out.println("Enter " + size + "Elemnet : ");

      for(int i = 0;i<arr.length;i++){
        arr[i] = sc.nextInt();
      }

      int max = Integer.MIN_VALUE;
      int secondLast = Integer.MIN_VALUE;
       

       for(int i = 0 ; i<arr.length;i++){   //[2,3,3,3]
           if(arr[i] > max){              // 1) (2>-232) T , 2) (3>2) T  3) (3>3) F
            secondLast = max;            // sec = -2232 , 2  , 3
            max = arr[i];                 // max = 2 , 3 
           } else if(arr[i] > secondLast && arr[i] != max ){    //  (3>2)
            secondLast = arr[i];
           } 
       }
        System.out.println("Second element is " + secondLast);

    }
}



