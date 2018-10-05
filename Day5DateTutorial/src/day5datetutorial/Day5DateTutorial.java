/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5datetutorial;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 *
 * @author Administrator
 */
public class Day5DateTutorial {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        calculateAge(LocalDate.of(1990, Month.MARCH, 2));
        System.out.println(howManyDaysToChristmas());
        System.out.println(createDateFromString("2007-12-29"));
    }

    public static void calculateAge(LocalDate dob) {
        LocalDate now = LocalDate.now();
        Period p = Period.between(dob, now);

        System.out.println(p);
    }

    private static String howManyDaysToChristmas() {
        return Period.between(LocalDate.now(), LocalDate.of(2018, Month.DECEMBER, 25)).toString();
    }

    public LocalDate createDate(short year, short month, short day) {
        return LocalDate.of(year, month, day);
    }

    private static boolean isBookLate(LocalDate dueDate, LocalDate dateReturned) {

        return dateReturned.isAfter(dueDate);

    }

    private static LocalDate createDateFromString(String date) {
        return LocalDate.parse(date);
    }
}
