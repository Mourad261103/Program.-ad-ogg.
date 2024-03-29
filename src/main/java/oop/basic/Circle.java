package oop.basic;

import java.awt.*;

public class Circle {
    Point center;
    int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getPerimeter()
    {
     return 2*radius*Math.PI;
    }

    public double getArea()
    {
        return Math.PI*Math.pow(radius,2);
    }

    public boolean contains(Point point)
    {
        double n=Math.sqrt(Math.pow(center.x-point.x,2)+Math.pow(center.y-point.y,2));
        if(n<radius)
        {
            return true;
        }
        return  false;
    }
    public void translate(int dx, int dy)
    {
        center.x= center.x+dx;
        center.y= center.y+dy;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
