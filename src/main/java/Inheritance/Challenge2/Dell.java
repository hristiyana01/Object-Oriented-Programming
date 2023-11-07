package Inheritance.Challenge2;

public class Dell extends Laptop{
    public Dell() {

    }
    //parametrized constructor
    public Dell(String name) {
        super(name);
    }
    public String getDetails() {
        return getName();
    }
}
