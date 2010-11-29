/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package homework4;

import java.util.Random;

/**
 *
 * @author mgechev
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
        Shape[] shapes = new Shape[10];

        Random rand = new Random();
        int shape;


        for (int i = 0; i < 10; i++) {

            shape = rand.nextInt(3);
            switch (shape) {
                case 0: shapes[i] = new Rectangle(rand.nextDouble() * 7 + 1,rand.nextDouble() * 7 + 1);
                break;
                case 1: shapes[i] = new Circle(rand.nextDouble() * 7 + 1);
                break;
                default: shapes[i] = new Square(rand.nextDouble() * 7 + 1);
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("Area = %f, Perimeter = %f for object - %s \n",shapes[i].area(),
                    shapes[i].perimeter(), shapes[i].getClass().toString());
        }

    }

}
