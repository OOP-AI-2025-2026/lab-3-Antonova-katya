package org.example.task2;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        if (length <= 0 || width <= 0 || height <= 0) {
            return;
        }
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getVolume() {
        return length * width * height;
    }

    public double getLateralSurfaceArea() {
        return 2 * length * width + 2 * width * height;
    }

    public double getSurfaceArea() {
        return 2 * length * width + 2 * length * height + 2 * width * height;
    }
}
