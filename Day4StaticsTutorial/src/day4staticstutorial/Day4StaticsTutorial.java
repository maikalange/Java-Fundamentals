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
public class Day4StaticsTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Vehicle benz = new Vehicle();
        Vehicle toyota = new Vehicle();
        Vehicle landrover = new Vehicle();

        toyota.startEngine();

        System.out.println(" Number of vehicles created " + Vehicle.getInstanceCount());
    }

}
