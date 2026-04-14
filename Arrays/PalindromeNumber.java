package Arrays;

public class PalindromeNumber {
    
public static boolean isArrayPalindrome(int arr[]) {

    int start = 0;
    int end = arr.length - 1;

    while(start < end){
        if(arr[start] != arr[end]){
            return false;
        }
        start++;
        end--;
    }

    return true;
}

  public static void main(String[] args) {
    int arr[] = {1,2,1};
    if (isArrayPalindrome(arr)) {
        System.out.println("It is a palindrome");
    }else{
        System.out.println("not");
    }
  }


}
