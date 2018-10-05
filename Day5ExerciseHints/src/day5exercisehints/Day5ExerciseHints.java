/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5exercisehints;

/**
 *
 * @author Administrator
 */
public class Day5ExerciseHints {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
        printPyramid(10);
    }

    
    /**
     * Prints a pyramid having a given number of level
     * @param numberOfLevels 
     */
    private static void printPyramid(int numberOfLevels) {
        for (int i = 1; i <= numberOfLevels; i++) {
            printPyramidLevel(i);
        }
    }

    /**
     * Prints a pyramid level given the number of stars
     * @param numberOfStars 
     */
    private static void printPyramidLevel(int numberOfStars) {
        for (int i = numberOfStars; i >= 1; i--) {
            //System.out.print(i-1 + " ");//hint number 2
            System.out.print(i + "\t");
            
        }
        System.out.println("");
    }
}
