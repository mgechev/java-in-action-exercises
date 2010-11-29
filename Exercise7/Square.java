/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package homework4;

/**
 *
 * @author mgechev
 */
public class Square extends Rectangle {

    public Square(double width) {
        super(width, width);
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    @Override
    public void setWidth(double width) {
        super.setHeight(width);
        super.setWidth(width);
    }

}
