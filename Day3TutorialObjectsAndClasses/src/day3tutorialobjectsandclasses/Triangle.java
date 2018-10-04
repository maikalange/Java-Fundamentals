/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3tutorialobjectsandclasses;

/**
 *
 * @author Administrator
 */
public class Triangle extends Shape {

    public Triangle(double lengthA, double lengthB, double lengthC) {
        super(lengthA, lengthB, lengthC);
    }

    @Override
    public double perimeter() {
        return lengthA + lengthB + lengthC;
    }

    @Override
    public double area() {
        double semi = perimeter() / 2;
        final double y = semi * (semi - lengthA) * (semi - lengthB) * (semi - lengthA);

        //Will have to use exception to throw an invalid argument exception
        if (y < 0) {
            throw new IllegalArgumentException(" The dimensions specified are out of range");
        }

        return Math.pow(y, 0.5);
    }

    @Override //override annotation
    public String toString() {
        return "Triangle Area " + area() + " perimeter " + perimeter() + " sideA " + lengthA + " ,sideB " + lengthB + " , sideC " + lengthC;
    }

}
