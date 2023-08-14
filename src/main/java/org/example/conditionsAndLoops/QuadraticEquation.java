package org.example.conditionsAndLoops;

// implement a program to solve quadratic equations.
// For the given quadratic equation coefficients (ax² + bx + c = 0),
// return one or two roots of the equation if there is any in the set of real numbers.

import java.util.Locale;
import java.util.Scanner;

// Input value is given via System.in. Output value must be printed to System.out.
// "no roots" (just a string value "no roots") if there is no root
// The a parameter is guaranteed to be not zero.
public class QuadraticEquation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double D = (b * b) - (4 * a * c);
        if (D < 0) {
            System.out.println("no roots");
        } else if (D == 0) {
            double x = (-b) / (2 * a);
            if (x == -0) x = Math.abs(x);
            System.out.println(x);
        } else if (D > 0) {
            double x1 = (-b - Math.sqrt(D)) / (2 * a);
            double x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println(x1 + " " + x2);
        }
    }
}
