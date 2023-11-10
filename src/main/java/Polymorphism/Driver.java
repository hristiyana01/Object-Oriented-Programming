package Polymorphism;

public class Driver {
    public static void main(String[] args) {

            Shape[] shapes = new Shape[2];
            shapes[0] = new Circle(2);
            shapes[1] = new Rectangle(2,3);

        System.out.println("Are of the cirle: "+ shapes[0].getArea());
        System.out.println("Area of the Rectangle: " + shapes[1].getArea());
    }
}
