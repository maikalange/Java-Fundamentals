/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.gov.hmrc.app; //

import uk.gov.hmrc.components.Util;

/**
 *
 * @author Administrator
 */
public class CommonPitfalls {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double result1;
        double result = Util.add(12, 5);
        {
            result1 = Util.add(12, 5);
        }
        double result2 = Util.subtract(12, 5);
        double result3 = Util.modulus(12, 5);
        double result4 = Util.divide(12, 5);

        System.out.println(result1);

        getChange(20);

        forLoopErrors();
    }

    private static void forLoopErrors() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
        }
        System.out.println(9);
    }

    private static void getChange(double cash) {
        double sandwich = 5.26;
        double drink = 4.83;
        double newspaper = 1.61;
        double transport = 5d;

        double change = cash - sandwich - drink - newspaper - transport;
        System.out.println(change);
    }

    private static void greet(String name) {
        System.out.println("Hello " + name);
    }

}
