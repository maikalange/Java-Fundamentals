/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nyirenda.conditionals;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Day2TutorialConditionals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //displayWeekDay();

        doTest();

        //displayWeekDay(true, dayofWeek);
    }

    private static void doTest() {

        boolean k = !(5<2) && !(5==2);
        System.out.println(k);
    }

    private static void displayWeekDay(boolean useSwitch, int day) {
        switch (day) {
            case 1:
                System.out.println("Day is Monday");
                break;
            case 2:
                System.out.println("Day is Tuesday");
                break;
            case 3:
                System.out.println("Day is Wednesday");
                break;
            case 4:
                System.out.println("Day is Thursday");
                break;
            case 5:
                System.out.println("Day is Friday");
                break;
            case 6:
                System.out.println("Day is Saturday");
                break;
            case 7:
                System.out.println("Day is Sunday");
                break;
            default:
                System.out.println("The day is unknown");
        }

    }

    private static void displayWeekDay() {
        Scanner myScanner = new Scanner(System.in);
        int day = myScanner.nextInt();

        if (day >= 1 && day <= 5) {
            System.out.println("Week day");
        } else if (day >= 6 && day <= 7) {
            System.out.println("Week end");
        } else {
            System.out.println("Error. The day supplied was out of range.");
        }
    }

    private static void displayWeekDay(int dayOfWeek) {

        if (dayOfWeek >= 1 && dayOfWeek <= 7) {
            String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

            String selectedDay = days[dayOfWeek - 1];

            String typeOfDay = (dayOfWeek >= 1 && dayOfWeek <= 5) ? "Week day" : " Week end";

            System.out.println("The day selected was " + selectedDay + " it is a " + typeOfDay);

        } else {
            System.out.println("Error. The day supplied was out of range");
        }

    }

}
