/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2tutorialnsurance;

/**
 *
 * @author Administrator
 */
public class Day2Tutorialnsurance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double premium = getInsurancePremium(0, 'M', (short) 0, true);
    }

    public static double getInsurancePremium(int age, char gender, short engineSize, boolean hasNoClaims) {

        double policy = 360;

        if (age >= 18 && age <= 25 && gender == 'M') {
            {

                if (engineSize >= 1000 & engineSize <= 1500) {

                    if (hasNoClaims) {
                        policy = InsuranceConstants.BASE_PREMIUM_1 * InsuranceConstants.PREMIUM_FACTOR_1;
                    }
                } else if (engineSize >= 1501 & engineSize <= 3000) {
                    policy = InsuranceConstants.BASE_PREMIUM_2 * InsuranceConstants.PREMIUM_FACTOR_2;
                }
            }
        }

        return policy;
    }

}
