package Test_1;

public class halfRevreseNumber {

    public static void main(String[] args) {
        int num = 123456;
        int temp = num;

        // count        // 6
        int ct=0;
        int t = num;
        while (t>0) {
            ct++;
            t/=10;
        }


        // Diviser 
        int div = 1;
        for(int i =1 ; i<=ct/2;i++){
            div*=10;
        }

        // spliet

        int first = num/div; // 123
        int second = num%div; //456
        System.out.println(second);


        int  rev = 0;
        while (second>0) {
            int last = second%10;
            rev = rev*10+last;
            second/=10;            // 654
        }


        System.out.println(first + "  " +rev);
    }
}