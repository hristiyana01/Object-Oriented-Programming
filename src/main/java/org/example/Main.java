package org.example;

public class Main {
    public static void main(String[] args) {
        Cop c = new Cop();
        c.getGun();

        Student student = new Student("Jack", 60, 70);
        System.out.println(student.getMarks(1));
        System.out.println(student.getMarks(2));
        System.out.println(student.calcTotal());

        Date date = new Date();
        date.printDate();
        Date date1 = new Date(28,8,2023);
        date1.printDate();

        Point p1 = new Point(5, 5);
        System.out.println(p1.distance());
        System.out.println(p1.distance(2, 1));

        Calculator obj = new Calculator(10, 94);
        System.out.println(obj.add());
        System.out.println(obj.subtract());
        System.out.println(obj.multiply());
        System.out.println(obj.divide());
    }
}