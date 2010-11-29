/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package homework4;

/**
 *
 * @author mgechev
 */
public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double _r)
    {
        radius = _r;
    }

    public double area()
    {
        return Math.PI*radius*radius;
    }

    public double perimeter()
    {
        return 2*Math.PI*radius;
    }

}
