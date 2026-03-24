package Test_1;

public class UglyNumber {
    public static void main(String[] args) {
        int num = 30;
        int temp = 30;



        while (num%2==0) {   //(30%2==0) T
          num = num/2;
          System.out.println(num);
        }
        while (num%3==0) {  //(15%3==0)  T
            num = num/3;
            System.err.println(num);
        }
        while (num%5==0) {  //(5%5==0)  T
            num = num/5;    // num = 1 
            System.out.println(num);
        }


        if(num == 1){
            System.out.println("It is a Ugly number");
        } else{
            System.out.println("Not a ugly number");
        }
    }
}
