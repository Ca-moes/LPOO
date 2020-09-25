package com.aor.refactoring.example1;

import com.aor.refactoring.example2.GraphicFramework;
import com.aor.refactoring.example2.Shape;

public class Rectangle extends Shape {
    private double width;  // ONLY FOR RECTANGLES
    private double height; // ONLY FOR RECTANGLES

    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public double getArea() { return width * height; }

    public double getPerimeter() { return 2 * (width + height); }

    public void draw(GraphicFramework graphics) {
        graphics.drawLine(this.getX(), this.getY(), this.getX() + width, this.getY());
        graphics.drawLine(this.getX() + width, this.getY(), this.getX() + width, this.getY() + height);
        graphics.drawLine(this.getX() + width, this.getY() + height, this.getX(), this.getY() + height);
        graphics.drawLine(this.getX(), this.getY() + height, this.getX(), this.getY());
    }
}
