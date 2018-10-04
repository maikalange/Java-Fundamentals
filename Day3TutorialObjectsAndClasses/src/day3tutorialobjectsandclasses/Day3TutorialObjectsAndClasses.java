/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3tutorialobjectsandclasses;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class Day3TutorialObjectsAndClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Triangle t = new Triangle(3, 4, 5);
        double k = t.perimeter();
        System.out.println("The perimeter is : " + k);
        try {
            double k1 = t.area();
            System.out.println("The area is : " + k1);//code quits here
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        Square mySquare = new Square(10);
        double x = mySquare.area();
        System.out.println("Area is " + x);

        Circle myCircle = new Circle(42d);
        double a = myCircle.area();
        double p = myCircle.perimeter();
        System.out.println("Area " + a);
        System.out.println("Perimeter " + p);
        //
        //myCircle.setRadius(10);
        System.out.println("Area " + myCircle.area());
        System.out.println("Perimeter " + myCircle.perimeter());

        System.out.println(myCircle);
        System.out.println(mySquare);
        System.out.println(t);

        BigDecimal bd = new BigDecimal(myCircle.area());//Good for currency calculations
        System.out.println("Area of the circle is " + bd.round(MathContext.DECIMAL32));
        //Home work read up on dates and custom formatters

        Circle myBigCircle = new Circle(10);
        Circle mySmallCircle = new Circle(10);

        boolean isEqual = myBigCircle.equals(mySquare);

        System.out.println(isEqual);

        Shape[] myShapes = new Shape[5];
        myShapes[0] = new Circle(10);
        myShapes[1] = new Square(1.5);
        myShapes[2] = new Square(3.5);
        myShapes[3] = new Triangle(5,5,5);
        myShapes[4] = new Triangle(5,4,3);

        for (Shape shape : myShapes) {
            //System.out.println(shape);
        }
        //Using a generic collection class

        List<Shape> shapesList = new ArrayList<>();//instantiate the generic list
        shapesList.addAll(Arrays.asList(myShapes));
        
        shapesList.forEach(System.out::println);
    }

}
