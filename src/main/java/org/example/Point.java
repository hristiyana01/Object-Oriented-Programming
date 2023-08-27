package org.example;

public class Point {
    private int x;
    private int y;

    public Point() {
        x = 0;
        y = 0;
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance() {
        double distance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        return distance;
    }

    public double distance(int x1, int y1) {

         double distance = Math.sqrt(Math.pow(x1 - x,2) + Math.pow(y1 - y,2));

         return distance;
    }

}
