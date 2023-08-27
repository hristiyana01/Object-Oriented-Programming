package org.example;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date() {
        day = 0;
        month = 0;
        year = 0;
    }
    public Date(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }

    public void printDate() {
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }

}
