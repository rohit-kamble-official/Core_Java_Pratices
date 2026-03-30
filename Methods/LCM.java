package Methods;

public class LCM {
     
    public static int lcmCall(int n1, int n2) {

        int max = (n1 > n2) ? n1 : n2;

        while (true) {
            if (max % n1 == 0 && max % n2 == 0) {
                return max;
            }
            max++;
        }
    }

    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 6;

        System.out.println("LCM is: " + lcmCall(n1, n2));
    }
}