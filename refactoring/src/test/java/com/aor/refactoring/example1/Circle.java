package com.aor.refactoring.example1;

import com.aor.refactoring.example2.GraphicFramework;
import com.aor.refactoring.example2.Shape;

public class Circle extends Shape {
    private double radius; // ONLY FOR CIRCLES

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getArea() { return Math.PI * Math.pow(radius, 2); }

    public double getPerimeter() { return 2 * Math.PI * radius; }

    public void draw(GraphicFramework graphics) {
        graphics.drawCircle(this.getX(), this.getY(), radius);
    }

}
