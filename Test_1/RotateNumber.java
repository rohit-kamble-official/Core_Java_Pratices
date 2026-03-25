package Test_1;

public class RotateNumber {
    public static void main(String[] args) {
        int num = 1234;
        int last = num%10;   // 4
        num =num/10;      // 123

        int pow = 1;    
        int temp = num;   //temp = 123

        while (temp>0) {    //(0>0) F
            pow = pow*10;    // 1*10 = 10   10*10 = 100   100*10 = 1000 1000*10 = 100000 
            temp = temp/10;   // 0 
        }
        int ans = last*pow+num;      // ans = 4*10000+1234 = 4123
        System.out.println(ans);
    }
}
