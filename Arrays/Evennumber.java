package Arrays;

public class Evennumber {
    

public static int EvenArray(int arr[]){


    for(int i = 0 ; i< arr.length;i++){
             if (arr[i]%2==0) {
                System.out.println(arr[i]);
             }

    }
    return -1;

}

public static void main(String[] args) {
    int arr[] = {2,3,4,5,1};
    EvenArray(arr);

}





}
