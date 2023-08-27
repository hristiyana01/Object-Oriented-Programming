package org.example;

public class Main {
    public static void main(String[] args) {
        Cop c = new Cop();
        c.getGun();

        Car car = new Car();
        Student student = new Student("Jack", 60, 70);
        System.out.println(student.getMarks(1));
        System.out.println(student.getMarks(2));
        System.out.println(student.calcTotal());

        Calculator cal = new Calculator();

        double x = 10;
        double y = 20;
        double z = 5;

        int a = 12;
        int b = 4;

        System.out.println(cal.product(x, y));
        System.out.println(cal.product(x, y, z));
        System.out.println(cal.product(a, b));

        Date date = new Date();
        date.printDate();
        Date date1 = new Date(28,8,2023);
        date1.printDate();

        Point p1 = new Point(5, 5);
        System.out.println(p1.distance());
        System.out.println(p1.distance(2, 1));
    }
}