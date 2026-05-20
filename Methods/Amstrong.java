package Methods;

public class Amstrong {
    public static int count(int num){
        int temp = num;
        int count = 0;
        while (temp>0) {
            count++;
            temp/=10;
        }
        return count;
    }

    public static int power(int rasis , int base){
        int power = 1;
        while (rasis>0) {
            power*= base;
            rasis--;
        }
         return power;
    }

    public static boolean isAmstrong(int num){
        int originl = num;
        int sum = 0;
        int digits = count(num);
        while (num>0) {
            int last = num%10;
          sum+=power(digits, last);
          num/=10;
        }
        return originl==sum;
    }


    public static void main(String[] args) {
        int num = 153;
        if (isAmstrong(num)) {
            System.out.println("It is a Amstrong");
        } else{
            System.out.println("Not ");
        }
    }
}
