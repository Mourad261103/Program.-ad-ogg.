package oop.basic;

import java.awt.*;
import java.util.Arrays;

public class Polygon {
    Point[] vertices;

    public Polygon(Point[] vertices)
    {
        this.vertices = vertices;
    }

    int getVerticesCount()
    {
        return vertices.length;
    }

    public double getPerimeter()
    {
        double per=0;
        for (int i = 0; i < vertices.length-1; i++)
        {
            per=per+Math.sqrt(Math.pow((vertices[i].x-vertices[i+1].x),2)+Math.pow((vertices[i].y-vertices[i+1].y),2));
        }
        per=per+Math.sqrt(Math.pow((vertices[0].x-vertices[vertices.length-1].x),2)+Math.pow((vertices[0].y-vertices[vertices.length-1].y),2));
        return per;
    }
    public double getArea()
    {
        double are=0;
        for (int i = 0; i < vertices.length-1; i++) {
            double lat=vertices[i].x*vertices[i+1].y;
            are=are+lat;
        }
        are=are+(vertices[vertices.length-1].x*vertices[0].y);
        are=are/2;
        if(are==0)
        {
            for (int i = vertices.length-1; i > 0 ; i--) {
                double lat=vertices[i].x*vertices[i-1].y;
                are=are+lat;
            }
            are=are+(vertices[0].x*vertices[vertices.length-1].y);
            are=are/2;
        }
        return are;
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "vertices=" + Arrays.toString(vertices) +
                '}';
    }




}
