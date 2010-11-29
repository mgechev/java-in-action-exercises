/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package homework4;

/**
 *
 * @author mgechev
 */
public class Rectangle extends Shape {


    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double area()
    {
        return width*height;
    }

    public double perimeter()
    {
        return 2*width+2*height;
    }

}
