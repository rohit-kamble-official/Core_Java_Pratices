package Methods;

public class SumOfDigits{
    public static int Sum(int num){
        
        int sum =0 ;
       while (num>0) {
          int last = num%10;
            sum+=last;
            num/=10;
       }
       return sum;


    }

    public static void main(String[] args) {
        int num = 1234;
        System.out.println(num +"      "  + Sum(num));
    }
}
