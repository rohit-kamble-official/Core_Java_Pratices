package Arrays;
import java.util.Scanner;

public class UserDefineArrayOneDimension {
    
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0 ; i<size;i++){

            System.out.print("Enter the " +(i+1)+ " elemnet of array");
            arr[i]=sc.nextInt();
        }
        System.out.println("Array element");

        for(int i : arr){
            System.out.println(i);
        }

    }
}
