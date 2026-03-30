package Methods;

public class MultiplicationTableProgram {

    public static void multiplication(int num) {
        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(num + " x " + i + " = " + result);
        }
    }

    public static void main(String[] args) {
        int num = 5;
        multiplication(num);
    }
}