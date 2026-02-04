package Test_1;
import java.util.Scanner;

class Banking {
    static String name;
    static String address;
    static long contact;
    static long adhar;
    static String pancard;
    static double balance;
    static int pin;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        welcomeLoop:
        for (; ; ) {
            System.out.println("\n          WELCOME ");
            System.out.println(" **** LAXMI CHIT FUND ****\n");
            System.out.println("1.CREATE ACCOUNT \n2.LOGIN\n");
            System.out.print("Enter your resp : ");
            int resp = sc.nextInt();

            switch (resp) {
                case 1: {
                    if (name != null) {
                        System.out.println("\n ACCOUNT ALREADY EXISTS \n");
                        continue;
                    }
                    System.out.println("\n ACCOUNT CREATION PAGE \n");
                    sc.nextLine();
                    System.out.print("Name : ");
                    name = sc.nextLine();
                    System.out.print("Address : ");
                    address = sc.nextLine();
                    System.out.print("Contact : ");
                    contact = sc.nextLong();
                    System.out.print("Adhar : ");
                    adhar = sc.nextLong();
                    sc.nextLine();
                    System.out.print("Pancard : ");
                    pancard = sc.nextLine();
                    System.out.print("Enter an amount : ");
                    balance = sc.nextDouble();
                    System.out.print("Pin : ");
                    pin = sc.nextInt();
                    System.out.println("*** ACCOUNT CREATED SUCCESSFULLY \n");
                    break;
                }

                case 2: {
                    if (name == null) {
                        System.out.println("\n CREATE YOUR ACCOUNT FIRST\n");
                        continue;
                    }
                    System.out.println("\n LOGIN MODULE \n");
                    System.out.print("Contact : ");
                    long userContact = sc.nextLong();
                    System.out.print("PIN : ");
                    int userPin = sc.nextInt();

                    if (contact == userContact && pin == userPin) {
                        System.out.println("\n LOGIN SUCCESSFULLY\n");

                        features:
                        for (; ; ) {
                            System.out.println("\n **** FEATURES **** \n");
                            System.out.println("1.DEPOSIT \n2.WITHDRAW \n3.CHECK BALANCE \n4.LOGOUT");
                            System.out.print("\nEnter your option : ");
                            int opt = sc.nextInt();

                            switch (opt) {
                                case 1: {
                                    System.out.println("\n DEPOSIT AMOUNT MODULE\n");
                                    System.out.print("Enter deposit amount : ");
                                    double deptAmt = sc.nextDouble();
                                    balance += deptAmt;
                                    System.out.println("\n AMOUNT DEPOSITED SUCCESSFULLY\n");
                                    break;
                                }
                                case 2: {
                                    System.out.println("\n WITHDRAW AMOUNT MODULE\n");
                                    System.out.print("Enter your pin : ");
                                    int pin1 = sc.nextInt();
                                    if (pin1 == pin) {
                                        System.out.print("Enter amount to withdraw : ");
                                        double wdrwAmt = sc.nextDouble();
                                        if (wdrwAmt <= balance) {
                                            balance -= wdrwAmt;
                                            System.out.println("\n AMOUNT DEBITED SUCCESSFULLY\n");
                                        } else {
                                            System.out.println("\n INSUFFICIENT FUNDS\n");
                                        }
                                    } else {
                                        System.out.println("\n INVALID PIN\n");
                                    }
                                    break;
                                }
                               
                                
                                case 4: {
                                    System.out.println("\n THANK YOU & VISIT AGAIN\n");
                                    continue welcomeLoop;
                                }
                                default: {
                                    System.out.println("\n INVALID RESPONSE\n");
                                }
                            }
                        }
                    } else {
                        System.out.println("\n INVALID CREDENTIALS \n");
                        break;
                    }
                }
                default: {
                    System.out.println("\n INVALID RESPONSE\n");
                }
            }
        }
    }
}