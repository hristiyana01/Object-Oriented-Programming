package org.example;

public class Calculator {
    public double product(double x, double y) {
        return x * y;
    }

    // Overloading the function to handle three arguments
    public double product(double x, double y, double z) {
        return x * y * z;
    }

    // Overloading the function to handle int
    public int product(int x, int y){
        return x * y;
    }
}
