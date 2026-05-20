package Test_1;

public class RangeOfneonnumbers {
    public static void main(String[] args) {

        int start = 1;
        int end = 100;

        for(int i = start ; i<=end ; i++){

         int sq = i*i;
         int sum = 0;

         while (sq>0) {
            int last = sq%10;
            sum = sum+last;
            sq/=10;
         }
   
         if (sum==i) {
            System.out.println(i);
         }
         
        }
    }
}