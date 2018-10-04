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
public abstract class Shape {

    protected int numberOfSides;
    protected double lengthA;
    protected double lengthB;
    protected double lengthC;

    public Shape(double sideA) {
        this.lengthA = sideA;
    }

    public Shape(double sideA, double sideB) {
        this.lengthA = sideA;
        this.lengthB = sideB;
    }

    public Shape(double sideA, double sideB, double sideC) {
        this.lengthA = sideA;
        this.lengthB = sideB;
        this.lengthC = sideC;
    }

    public abstract double area();

    public abstract double perimeter();

    public int getNumberOfSides() {
        return numberOfSides;
    }
}
