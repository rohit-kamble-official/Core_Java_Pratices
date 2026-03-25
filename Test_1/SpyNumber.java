package Test_1;

public class SpyNumber {
    public static void main(String[] args) {
        int num = 123;
       
        int sum = 0;
        int Product = 1;

        while (num>0) {
         int last = num%10;
         sum+=last;
         Product*=last;
         num/=10;
        }
      
        if (sum==Product) {
            System.out.println("It is a Spy number");
        } else{
            System.out.println("not");
        }




    }
}
