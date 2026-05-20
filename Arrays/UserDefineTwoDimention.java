package Arrays;

import java.util.Scanner;

public class UserDefineTwoDimention {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // First dimension (Rows)
        System.out.print("Enter first dimension of array: ");
        int size1 = sc.nextInt();

        int[][] arr = new int[size1][];

        // Create columns dynamically
        for (int i = 0; i < size1; i++) {

            System.out.print("Enter second dimension size for "
                    + (i + 1) + " array: ");

            int size2 = sc.nextInt();

            arr[i] = new int[size2];
        }

        // Input elements
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print("Enter "
                        + (j + 1)
                        + " element of "
                        + (i + 1)
                        + " array: ");

                arr[i][j] = sc.nextInt();
            }
        }

        // Print array
        System.out.println("\nArray Elements:");

        for (int[] i : arr) {

            for (int j : i) {

                System.out.print(j + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}