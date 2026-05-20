package Methods;


class FibonaaciiPrime {

    // 🔹 Check Prime
    static boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 🔹 Check Fibonacci
    static boolean isFibonacci(int num) {
        int a = 0, b = 1;

        while (a <= num) {
            if (a == num) return true;

            int c = a + b;
            a = b;
            b = c;
        }
        return false;
    }

    // 🔹 General Checker Method
    static String checkNumber(int num) {

        boolean prime = isPrime(num);
        boolean fibo = isFibonacci(num);

        if (prime && fibo) {
            return "Prime Fibonacci Number";
        } 
        else if (prime) {
            return "Only Prime Number";
        } 
        else if (fibo) {
            return "Only Fibonacci Number";
        } 
        else {
            return "Neither Prime nor Fibonacci";
        }
    }

    public static void main(String[] args) {

        int num = 13;

        String result = checkNumber(num);

        System.out.println(num + " -> " + result);
    }
}