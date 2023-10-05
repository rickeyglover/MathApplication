package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        //question 1
        double bobSalary = 10000.00;
        double garySalary = 5000.00;
        double highestSalary = 0;
        highestSalary = Math.max(bobSalary,garySalary);
        System.out.println("The highest salary is: " + highestSalary);
        //question 2
        double carPrice = 20000.00;
        double truckPrice = 30000.00;
        double cheapestVehicle = 0;
        cheapestVehicle = Math.min(carPrice,truckPrice);
        System.out.println("The cheaper vehicle is: " + cheapestVehicle);
        //question 3
        double radius = 7.25;
        System.out.println("The area of a circle with the radius of 7.25 is: " + (Math.PI*Math.pow(radius,2)));
        //question 4
        double square_root = 5.0;
        System.out.println("The square root is: " + (Math.sqrt(square_root)));
        //question 5
        double distance = Math.sqrt(Math.pow((85 - 5), 2) + Math.pow((50 - 10), 2));
        System.out.println(Math.sqrt(Math.pow((85 - 5), 2) + Math.pow((50 - 10), 2)));
        //question 6
        double absolute_value = -3.8;
        System.out.println("The absolute positive value is: " + (Math.abs(-3.8)));
        //question 7
        double min = (0);
        double max = (1);
        double rand = Math.random();
        System.out.println("Random Number: " + rand);



    }
}
