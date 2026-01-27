
package Operator;

 class AverageSpeed {
    public static void main(String[] args) {

        double kilometers = 14;
        double miles = kilometers / 1.6;

        double timeInHours = (45.0 / 60) + (30.0 / 3600);

        double averageSpeed = miles / timeInHours;

        System.out.printf("Average speed in miles per hour : %.2f", averageSpeed);
    }
}
