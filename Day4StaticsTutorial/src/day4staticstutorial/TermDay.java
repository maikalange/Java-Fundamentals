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
public class TermDay {
    private byte day;
    private byte week;
        
    public void setDay(byte day) {
        if (day >= 0 && day <= 6) {
            this.day = day;
        } else {
            throw new IllegalArgumentException("The day was out of range");
        }
    }

    public void setWeek(byte week) {

        if (week >= 0 && week <= 7) {
            this.week = week;
        } else {
            throw new IllegalArgumentException("The week was out of range");
        }
    }
}
