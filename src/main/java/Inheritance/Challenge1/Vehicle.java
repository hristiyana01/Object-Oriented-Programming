package Inheritance.Challenge1;

public class Vehicle {
    public String speed;
    public String model;
    public Vehicle() {
        speed = "100";
        model = "Tesla";
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
