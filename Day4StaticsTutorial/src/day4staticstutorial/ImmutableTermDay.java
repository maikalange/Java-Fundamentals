/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4staticstutorial;

/**
 *
 * @author Administrator
 */
public class ImmutableTermDay {

    private int day;
    private int week;
    private static ImmutableTermDay instance;

    private ImmutableTermDay(int day, int week) {
        setDay(day);
        setWeek(week);
    }

    public static ImmutableTermDay createInstance(int day, int week) {
        if (instance == null) {
            instance = new ImmutableTermDay(day, week);
        }
        return instance;
    }

    private void setDay(int day) {
        if (day >= 0 && day <= 6) {
            this.day = day;
        } else {
            throw new IllegalArgumentException("The day was out of range");
        }
    }

    private void setWeek(int week) {

        if (week >= 0 && week <= 7) {
            this.week = week;
        } else {
            throw new IllegalArgumentException("The week was out of range");
        }
    }
    
    @Override
    public String toString(){
        return " Week " +week +  " , day " +  day;
    }
    
     static class Test{
        int age;
        
    }

}
