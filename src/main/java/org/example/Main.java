package org.example;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        System.out.println("The sum of the numbers is: " + (a+b));

        Cop c = new Cop();
        c.getGun();

        Car car = new Car();
        System.out.println(car.manufacturer);
        System.out.println(car.fuelCapacity);

        car.printSpeed(200);

        System.out.println(Car.topSpeed);
        System.out.println(Car.maxCapacity);

        System.out.println(car.getTopSpeed());
    }
}