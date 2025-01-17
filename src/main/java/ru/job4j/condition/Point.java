package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    private int x;
    private int y;
    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return sqrt(Math.pow((this.x - that.x), 2) + pow((this.y - that.y), 2));
    }

    public double distance3D(Point that) {
        return sqrt(pow(that.x - x, 2) + pow(that.y - y, 2) + pow(that.z - z, 2));
    }

    public void info() {
        System.out.println("Point[" + this.x + ", " + this.y + "]");
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(1, 1);
        Point d = new Point(2, 3);
        double result = a.distance(b);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = a.distance(d);
        System.out.println("result (0, 0) to (2, 3) " + result);
        result = c.distance(d);
        System.out.println("result (1, 1) to (1, 5) " + result);
    }
}
