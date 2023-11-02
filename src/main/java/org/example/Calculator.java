package org.example;

public class Calculator {
    private int num1;
    private int num2;
    public Calculator(int a, int b) {
        this.num1 = a;
        this.num2 = b;
    }
    public double add() {
        return this.num2 + this.num1;
    }
    public double subtract() {
        return this.num2 - this.num1;
    }
    public double multiply() {
        return this.num2 * this.num1;
    }
    public double divide() {
        return (double) this.num2 / this.num1;
    }
}
