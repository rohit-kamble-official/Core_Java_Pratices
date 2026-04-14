package Arrays;

public class EvenInndex {
    
    public static int evenArrayIndex(int arr[]){


        for(int i = 0; i < arr.length; i += 2){      
            System.out.println(arr[i]);                         
                                                      
            }                                          
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {3,2,4,6,5};
        evenArrayIndex(arr);
       
    }
}


