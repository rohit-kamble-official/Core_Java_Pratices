package Operator;
import java.util.Scanner;

class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a radius (cm) : ");
        double radius = sc.nextDouble();

        final double PI = 22 / 7.0;
        final double AREA = PI * radius * radius;
        final double PERIMETER = 2 * PI * radius;

        System.out.println("Radius : " + radius + " cm");
        System.out.printf("Area of circle : %.3f cm²%n", AREA);
        System.out.printf("Perimeter of circle : %.3f cm%n", PERIMETER);

        sc.close();
    }
}
