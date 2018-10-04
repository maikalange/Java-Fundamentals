/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4genericcollectionstutorial;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/**
 *
 * @author Administrator
 */
public class Day4GenericCollectionsTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        List<String> names = getNames();
//
//        for (String name : names) {
//            System.out.println("The length of the name is: " + name.length());
//        }
//        System.out.println(lotteryNumber().size());

        HashMap<Integer, TaxPayer> tp = getTaxPayer();

        for (Integer t : tp.keySet()) {
            System.out.println(tp.get(t));
        }

        System.out.println(getFormattedCurrency(Locale.UK, 35.934399002222));
    }

    private static HashMap<Integer, TaxPayer> getTaxPayer() {
        HashMap<Integer, TaxPayer> taxPayers = new HashMap<>();

        taxPayers.put(243431, new TaxPayer());
        taxPayers.put(243432, new TaxPayer());
        taxPayers.put(243433, new TaxPayer());
        taxPayers.put(243432, new TaxPayer());
        return taxPayers;
    }

    private static Set<Integer> lotteryNumber() {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(2);//values are boxed to reference types
        numbers.add(3);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        return numbers;
    }

    private static String getFormattedCurrency(Locale locale, double amount) {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        return currencyFormatter.format(amount);
    }

    protected static List<String> getNames() {
        List<String> names = new ArrayList();//Instantiate the list
        //Add items to the list
        names.add("John");
        return names;
    }
    
    

}
