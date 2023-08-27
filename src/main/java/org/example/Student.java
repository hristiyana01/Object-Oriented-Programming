package org.example;

public class Student {
    private String name;
    private double mark1;
    private double mark2;

    public double getMarks(int markNumber) {

        if(markNumber == 1) {
            return mark1;
        } else if (markNumber ==2){
            return mark2;
        }
        return 0;
    }

    public double calcTotal() {
        return mark1 + mark2;
    }

    public Student() {
        name = "";
        mark1 = 0.0;
        mark2 = 0.0;
    }
    public Student(String name, double mark1, double mark2) {
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }
}
