package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;

        do {
            System.out.println("Menu.");
            System.out.println("1. F ==> C");
            System.out.println("2. C ==> F");
            System.out.println("0. Exit");
            System.out.println("chọn đi nào!");
            choice = input.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("nhập F ");
                    fahrenheit = input.nextDouble();
                    System.out.println("C = " + fahrenheitToCelsius(fahrenheit));
                    break;
                }
                case 2:{
                    System.out.println("nhập C ");
                    celsius = input.nextDouble();
                    System.out.println("F = " + celsiusToFahrenheit(celsius));
                    break;
                }
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}