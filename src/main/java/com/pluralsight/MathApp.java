package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        //Question 1
        double bobSalary = 2368.48;
        double garySalary  = 2445.92;

        double highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is: $"+ highestSalary);



        //Question 2
        double carPrice = 34568.58;
        double truckPrice  = 45764.12;
        double lowest_price;

        lowest_price = Math.min(carPrice, truckPrice);

        System.out.println("The lowest price is "+ lowest_price);



        //Question 3
        double radius = 7.25;
        double area;

        area = Math.PI * Math.pow(radius, 2);

        System.out.println("The area is "+ area);


        //Question 4
        double num = 5.0;
        double square_root = Math.sqrt(num); //square root of num

        System.out.println("The square root is " + square_root);


        //Question 5
        double x1 = 5;
        double y1 = 10;
        double x2 = 85;
        double y2 = 50;

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); // distance between the points

        System.out.println("The distance between the points is " + distance);


        //Question 6
        double x = -3.8;
        double abs_x = Math.abs(3.8); //absolute value

        System.out.println("The absolute value of x is " + abs_x);

        //Question 7
        double random_num = Math.random();
        System.out.println("The random number is " + random_num);
    }
}

