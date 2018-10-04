/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Exercises2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //cylinderVolume();
        System.out.println("Enter investment value");
        Scanner myScanner = new Scanner(System.in);
        double v = myScanner.nextDouble();
        System.out.println("Enter annual interest rate in percentage value");
        double r = myScanner.nextDouble();
        System.out.println("Enter number of years");
        double y = myScanner.nextDouble();
        
        double t = getFutureInvestmentValue(v, r, y);
        
        System.out.println("Accumulated value is £" + t);
        
    }

    private static void cylinderVolume() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter the radius of the cylinder");

        double radius = myScanner.nextDouble();

        System.out.println("Please enter the length of the cylinder");
        double length = myScanner.nextDouble();

        double area = Math.pow(radius, 2) * Math.PI;

        double volume = area * length;

        System.out.println("The area is:: " + Math.floor(area));
        System.out.println("The volume is:: " + Math.floor(volume));
    }

    private static double getFutureInvestmentValue(double investmentAmount, double interestRate, double years) {

        return investmentAmount * Math.pow((1 + interestRate /(1200)), years * 12);
    }

}
