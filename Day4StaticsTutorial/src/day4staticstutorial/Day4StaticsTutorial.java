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

        ImmutableTermDay itd = ImmutableTermDay.createInstance(3, 4);
        ImmutableTermDay itd2 = ImmutableTermDay.createInstance(5, 2);

        System.out.println(itd);
        System.out.println(itd2);
        printTable();

    }
    
    private static void printTable(){
        System.out.println("Heading1\tHeading2\n1234\t\t989898976\n1234\t\t989898976\n1234\t\t989898976");
    }

}
