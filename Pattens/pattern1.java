package Pattens;

public class pattern1 {
    public static void main(String[] args) {
        int m = 4;
        int n = 4;
        //outer
        for(int i=0;i<m;i++){
            
              //inner
              for(int j =0;j<=n;j++){
                System.out.print("*");
              }
        }
        System.out.println(" ");
    }
}
