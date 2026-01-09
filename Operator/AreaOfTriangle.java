package Operator;
import java.util.Scanner;

public class AreaOfTriangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the height: ");
        int h = input.nextInt();

        System.out.print("Enter the base: ");
        int b = input.nextInt();

        double area = 0.5 * b * h;

        System.out.println("Area of Triangle is: " + area);

        input.close();
    }
}
