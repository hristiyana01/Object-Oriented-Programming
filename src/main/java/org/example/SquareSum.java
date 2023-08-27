package org.example;

public class SquareSum {
    double squareSum(double num1, double num2, double num3) {
        double sum = 0;

        // Write your code here
        num1 *= num1;
        num2 *= num2;
        num3 *= num3;

        sum = num1 + num2 + num3;
        return sum;
    }

}
