package Operator;

class Popoulation {
    public static void main(String[] args) {

        long currentPopulation = 312032486;

        long secondsInYear = 365L * 24 * 60 * 60;

        long birthsPerYear = secondsInYear / 7;
        long deathsPerYear = secondsInYear / 13;
        long immigrantsPerYear = secondsInYear / 45;

        long yearlyIncrease = birthsPerYear - deathsPerYear + immigrantsPerYear;

        long year1 = currentPopulation + yearlyIncrease;
        long year2 = year1 + yearlyIncrease;
        long year3 = year2 + yearlyIncrease;
        long year4 = year3 + yearlyIncrease;
        long year5 = year4 + yearlyIncrease;

        System.out.println("Population after 1 year : " + year1);
        System.out.println("Population after 2 years: " + year2);
        System.out.println("Population after 3 years: " + year3);
        System.out.println("Population after 4 years: " + year4);
        System.out.println("Population after 5 years: " + year5);
    }
}
