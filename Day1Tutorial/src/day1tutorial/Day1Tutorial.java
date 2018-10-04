/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1tutorial;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

/**
 *
 * @author Administrator
 */
public class Day1Tutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World");

        String[] names = {"Mary", "Todd", "Scott", "Fred", "Andre"};

        int y = 15 % 6;
        System.out.println(y);

        for (int i = names.length - 1; i >= 0; i--) {
            greet(names[i].toUpperCase());
        }

        System.out.println(isOdd(10));
        displayEvenNumbers(20, 50);
        System.out.println((getFormattedCurrency(Locale.UK, 12345)));
       
    }

    private static String getFormattedCurrency(Locale locale, double amount) {
        NumberFormat currencyFormatter = NumberFormat.getInstance();
        return Currency.getInstance(locale).getSymbol().concat(currencyFormatter.format(amount));
    }

    private static void displayEvenNumbers(int start, int end) {
        for (int k = start; k <= end; k++) {
            if (!isOdd(k)) {
                System.out.println(k);
            }
        }
    }

    private static boolean isOdd(int x) {
        return (x % 2 == 1);
    }

    private int doubleNumber(int k) {
        return 2 * k;
    }

    private static void greet(String name) {
        System.out.println("Hello " + name);
    }

}
