package Test_1;

public class DuckNumber {
    public static void main(String[] args) {
        int num = 12303;
        int temp =  num;
        boolean duck  = false;

        while (temp>0) {
            int last =  temp%10;
            if (last==0) {
                duck = true;
                break;
            }
            temp/=10;
        }
        if (duck && num%10!=0) {
            System.out.println("Duck");
        }else{
            System.out.println("Not ");
        }
       
    }
}
