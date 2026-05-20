import java.util.Scanner;

class CurrencyConvertor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // infinite loop
        for (;;) {
            System.out.println("\nWELCOME");
            System.out.println("******** CURRENCY CONVERTER ********");

            System.out.print("Enter amount (INR): ");
            double amount = sc.nextDouble();

            System.out.println(
                "USD | EUR | GBP | KWD | AED | JPY | CAD | AUD | CHF | SGD"
            );
            System.out.print("Enter your response: ");
            String resp = sc.next().toUpperCase();

            boolean valid = true;
            double convertedAmount = 0;

            if (resp.equals("USD")) {
                convertedAmount = amount / 83.20;
            } else if (resp.equals("EUR")) {
                convertedAmount = amount / 90.50;
            } else if (resp.equals("GBP")) {
                convertedAmount = amount / 105.30;
            } else if (resp.equals("KWD")) {
                convertedAmount = amount / 270.10;
            } else if (resp.equals("AED")) {
                convertedAmount = amount / 22.65;
            } else if (resp.equals("JPY")) {
                convertedAmount = amount / 0.56;
            } else if (resp.equals("CAD")) {
                convertedAmount = amount / 61.80;
            } else if (resp.equals("AUD")) {
                convertedAmount = amount / 55.40;
            } else if (resp.equals("CHF")) {
                convertedAmount = amount / 94.70;
            } else if (resp.equals("SGD")) {
                convertedAmount = amount / 61.30;
            } else {
                valid = false;
                System.out.println("\nINVALID CURRENCY!");
            }

            if (valid) {
                System.out.printf(
                    "%.2f INR = %.2f %s%n",
                    amount, convertedAmount, resp
                );
            }
        }
    }
}