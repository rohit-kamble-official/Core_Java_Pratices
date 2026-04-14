package Arrays;

public class AmstrongNumber {
      
    public static int count(int num){
        int count = 0;
        while (num>0) {
            int last = num%10;
            count++;
            num/=10;
        }
        return count;
    }

    public static int  power(int base , int raise){

        int pow = 1;
        
        while (raise>0) {
            pow*=base;
            raise --;
        }
        return pow;
    }
    public static void isArmstrong(int arr[]){

        for(int i = 0 ; i<arr.length ; i++){
            int num = arr[i];
            int temp = num;
             
            int ct = count(num);
            int sum = 0;
            while (num>0) {
            int last = num%10;
            sum = sum+power(last, ct);
            num/=10;
            }
            if (temp==sum) {
            System.out.println(temp);
            }
        }
    }


    public static void main(String[] args) {
        int arr[] = {153,370,123,407};
       isArmstrong(arr);
    }
}
