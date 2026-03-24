package Test_1;

public class XylemNumber {
    public static void main(String[] args) {
        
        int num = 12321;
       int temp =num;
        
       int last = num%10;   // 1
       num = num/10;      //1232
       int meanSum = 0;
    
      while (num>9) {
        //  1   (false)
         meanSum+=num%10; 
         num/=10;                        // sum = 2+3+2 = 7
      }

      int first = num;        // first  = 1;

     if (first+last==meanSum) {
        System.out.println("It is a Xylem Number");
        
     } else{
        System.out.println("It is a Phloem Number");
     }

    }
}
