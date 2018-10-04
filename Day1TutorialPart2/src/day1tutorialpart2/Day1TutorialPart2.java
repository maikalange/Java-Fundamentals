/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1tutorialpart2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Day1TutorialPart2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        generateLotteryNumber();

    }

    public double average(double[] values) {
        return sum(values) / values.length;
    }

    private double sum(double[] values) {
        double total = 0;
        for (int i = 0; i < values.length; i++) {
            total += values[i];
        }

        return total;
    }

    private static void generateLotteryNumber() {
        int[] items = new int[6];//declaring an array
        for (int z = 0; z < items.length; z++) {
            int x = generateLotteryNumber(50);
            while (x == 0) {//no zeros in my array
                x = generateLotteryNumber(50);
            }
            //TODO avoid duplicates
            if (!hasDuplicate(items, x)) {
                items[z] = x;//populating an array with values
            }

            System.out.println(x);
        }
    }

    private static boolean hasDuplicate(int[] items, int x) {
        boolean isDuplicate = false;
        for (int i : items) {//enhanced for loop
            if ((i == x)) {
                isDuplicate = true;
            }
        }
        return isDuplicate;
    }

    private static int generateLotteryNumber(int range) {
        return (int) (Math.random() * range);
    }

    private static void promptWithFor() {
        //TODO implement the code above but using a for loop
        Scanner myScanner = new Scanner(System.in);
        int k = 0;
        for (; k < 10;) {
            System.out.println("Enter a number greater than or equal to 10");
            k = myScanner.nextInt();
        }
        myScanner.close();
    }

    private static void promptWithDoWhile() {
        Scanner myScanner = new Scanner(System.in);
        int k = 0;
        do {
            System.out.println("Enter a number greater than or equal to 10");
            k = myScanner.nextInt();
        } while (k < 10);
        myScanner.close();
    }

    private static void printTimesTable(int start, int end) {
        for (int i = 1; i <= start; i++) {
            for (int j = 1; j <= end; j++) {//inner loop
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }

    }

}
