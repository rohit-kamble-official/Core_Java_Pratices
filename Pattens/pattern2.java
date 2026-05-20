package Pattens;
public class pattern2 {

    public static void main(String[] args) {

        int n = 4;

        for(int i = 1; i <= n; i++) {        // rows

            for(int j = 1; j <= n; j++) {    // columns

                int num;

                if(j % 2 == 1) {
                    num = (j-1)*n + i;
                } 
                else {
                    num = j*n - i + 1;
                }

                System.out.print(num + " ");
            }

            System.out.println();
        }
    }
}