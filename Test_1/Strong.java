package Test_1;

public class Strong {
    public static void main(String[] args) {
         
        int num = 145;         
        int temp = num;  
        int sum = 0;

        while (num>0) {       //(145>0) T 
            int last = num%10;  // 5
            int fact = 1;
            for(int i=1;i<=last;i++){   //(i=1;i<=5;i++)
           fact = fact *i;            
            }
            sum = sum+fact;
            num/=10;

        }
        if (temp==sum) {
            System.out.println("Strong Number");
        }else{
            System.out.println("It is not Strong");
        }
    }
}
