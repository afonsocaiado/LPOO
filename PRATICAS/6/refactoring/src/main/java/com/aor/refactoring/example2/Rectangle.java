package com.aor.refactoring.example2;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double x, double y, double height, double width){
        super(x,y);
        this.height = height;
        this. width = width;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public void draw(GraphicFramework graphics){
        graphics.drawLine(x, y, x + height, y);
        graphics.drawLine(x +height, y, x + height, y + width);
        graphics.drawLine(x + height, y + width, x, y + width);
        graphics.drawLine(x, y + width, x, y);
    }
}
