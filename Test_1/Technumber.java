package Test_1;

public class Technumber {
    public static void main(String[] args) {
        
        int num = 2025;
        int temp = num;

        //count 
    int ct = 0;   // 4
    int t = num;
    while (t>0) {
          ct++;
          t/=10;
    }

    // Even 
    if(ct%2==0){   //(4%2==0)    
     
       // divier
       int div = 1;
       for(int i =1 ; i<=ct/2;i++){
        div*=10;
       }

       int firstPart = num/div; // 20
       int secondPart = num%div; // 25

       int sum = firstPart+secondPart; // 45 

       if (sum*sum==temp) {
        System.out.println("It is Tech number");
       } else{
        System.out.println("It is not tech number");
       }

    }else{
        System.out.println("It is not Even number");
    }

    }
}
