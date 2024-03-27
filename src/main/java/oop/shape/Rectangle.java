package oop.shape;

import java.awt.*;

public class Rectangle extends AbstractShape{
    Point upperLeft;
    Point bottomRight;


    public Rectangle(String color, String id, Point upperLeft, Point bottomRight) {
        super(color, id);
        this.upperLeft = upperLeft;
        this.bottomRight = bottomRight;
    }

    public Point getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(Point bottomRight) {
        this.bottomRight = bottomRight;
    }

    public Point getUpperLeft() {
        return upperLeft;
    }

    public void setUpperLeft(Point upperLeft) {
        this.upperLeft = upperLeft;
    }

    @Override
    public double getArea() {
        return (bottomRight.x-upperLeft.x)*(upperLeft.y- bottomRight.y);
    }

    @Override
    public double getPerimeter() {
        return ((bottomRight.x-upperLeft.x)+(upperLeft.y- bottomRight.y))*2;
    }

    @Override
    public void move(Point movement)
    {
        upperLeft.translate(movement.x, movement.y);
        bottomRight.translate(movement.x, movement.y);
    }

    @Override
    public void resize(double res) {
        bottomRight.x= (int)(upperLeft.x+((bottomRight.x- upperLeft.x)*res));
        bottomRight.y= (int)((bottomRight.y)+(upperLeft.y+((-(upperLeft.y)*res))));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "bottomRight=" + bottomRight +
                ", upperLeft=" + upperLeft +
                ", color='" + color + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
