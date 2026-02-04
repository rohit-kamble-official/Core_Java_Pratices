package Test_1;
import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (; ; ) {
            System.out.println("\n ***** WELCOME *****");

            System.out.print("Amount : ");
            double amount = sc.nextDouble();
            if (amount < 1000 || amount > 100000) {
                System.out.println("\n INVALID AMOUNT");
                continue;
            }

            System.out.print("Rate of Interest (P.M) : ");
            double interest = sc.nextDouble();
            if (interest < 1 || interest > 30) {
                System.out.println("\n INVALID INTEREST \n");
                continue;
            }

            System.out.print("Loan Tenure (months) : ");
            int tenure = sc.nextInt();
            if (tenure < 3 || tenure > 36) {
                System.out.println("\n INVALID TENURE \n");
                continue;
            }

            // Calculations
            double perMonthInt = (amount / 100) * interest;
            double totalInterestAmount = perMonthInt * tenure;
            double totalAmount = amount + totalInterestAmount;
            double emi = totalAmount / tenure;

            // Output
            System.out.println("\n----- LOAN DETAILS -----");
            System.out.println("Principal Amount : " + amount);
            System.out.println("Total Interest   : " + totalInterestAmount);
            System.out.println("Total Amount     : " + totalAmount);
            System.out.println("Monthly EMI      : " + emi);

            System.out.println("\nPress 1 to Continue | 0 to Exit");
            int choice = sc.nextInt();
            if (choice == 0) {
                System.out.println("\n THANK YOU 🙏");
                break;
            }
        }
        sc.close();
    }
}
