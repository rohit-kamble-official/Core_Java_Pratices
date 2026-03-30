package Methods;

public class HCF {

    public static int hcfCall(int n1, int n2) {

        int small = (n1 < n2) ? n1 : n2;

        while (small > 0) {
            if (n1 % small == 0 && n2 % small == 0) {
                return small;
            }
            small--; // VERY IMPORTANT
        }

        return 1;
    }

    public static void main(String[] args) {

        int n1 = 15;
        int n2 = 6;

        System.out.println("HCF : " + hcfCall(n1, n2));
    }
}