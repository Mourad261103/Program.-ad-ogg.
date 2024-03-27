package oop.shape;

import java.awt.*;

public class Circle extends AbstractShape{

    Point center;
    double radius;

    public Circle(String color, String id, Point center, double radius) {
        super(color, id);
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {
        return 2*radius*Math.PI;
    }

    @Override
    public void move(Point movement) {
        center.x= center.x+ movement.x;
        center.y= center.y+ movement.y;
    }

    @Override
    public void resize(double res) {
        setRadius(radius*res);
    }
}
