package Inheritance.Challenge1;

public class Car extends Vehicle{
    public String name;

    public Car() {
        name  = "";
    }

    public void setDetails(String name) {
        this.name = name;
    }
    public String getDetails(String carName) {
        String details = carName + ", " + getModel() + ", " + getSpeed();

        return details;
    }
}
