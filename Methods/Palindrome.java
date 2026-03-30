package Methods;

public class Palindrome {
    
    public static int reverse(int num){
        int temp = num;
        int rev = 0;

        while (temp>0){
        int last = temp%10;
        rev = rev*10+last;
        temp/=10;
        }
        return rev;
            
        }
        public static boolean isPalindrome(int num){
           
          return num == reverse(num);
            }

            public static void main(String[] args) {
                int num = 1221;
                if (isPalindrome(num)) {
                    System.out.println("It is a palindromm");
                } else{
                    System.out.println(
                        "not"
                    );
                }
            }
    }


