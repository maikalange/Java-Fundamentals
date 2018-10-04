/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3loopsexercises5;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 *
 * @author Administrator
 */
public class Day3LoopsExercises5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        calculateTuition();
        //compareLoans(10000, 0.05, 12);
        System.out.println("Amount to repay " + compareLoans(10000, 5d / 12, 12));
    }

    private static double compareLoans(double amount, double rate, double years) {

        //Loan amount and loan period
        return (rate * amount) / (1 - Math.pow((1 + rate), (-1) * (years)));

    }

    private static void calculateTuition() {

        double[] tuitionFees = new double[14];
        double tenYearIncrement = 1;
        double fourteenYearIncrement = 1;

        for (int i = 1; i <= 10; i++) {
            tenYearIncrement = tenYearIncrement * 1.05;
        }

        for (int i = 0; i < tuitionFees.length; i++) {
            fourteenYearIncrement *= 1.05;
            tuitionFees[i] = fourteenYearIncrement * 10000;
        }

        //add up elements from 9 to 13;
        double total = 0;
        for (int k = 10; k <= 13; k++) {
            total += tuitionFees[k];
        }

        System.out.println(total);

        //after 10 years
        double yearTen = tenYearIncrement * 10000;
        double yearFourteen = fourteenYearIncrement * 10000;

        System.out.println("After 10 years " + yearTen);
        System.out.println("After 14 years " + yearFourteen);
        
        BigDecimal bd  = new BigDecimal(total);     
        
        System.out.println(" £ " + bd.round(MathContext.DECIMAL32));

    }

}
