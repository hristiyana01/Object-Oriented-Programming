package org.example;

public class Car {
    static int topSpeed = 100;
    int totalSeats;
    final int fuelCapacity = 30;
    static int maxCapacity = 4;
    String manufacturer;

    public int printSpeed(int speed) {
        //System.out.println("The speed is: " + speed);
        return speed + 5;
    }
    public void setTopSpeep(int speed) {
        topSpeed = speed;
    }
    public int getTopSpeed() {
        return topSpeed;
    }
    void refuel() {
        //int fuel = 4;
    }
    void park() {
        //topSpeed = 0;
     }
     void drive() {

     }
}
