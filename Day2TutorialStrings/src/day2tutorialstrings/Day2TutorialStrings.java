/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2tutorialstrings;

/**
 *
 * @author Administrator
 */
public class Day2TutorialStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        String title = "Brexit uncertain";
//        String author = "Mike Brown. ";
//
//        int length = title.length();
//        char firsChar = title.charAt(0);
//        char lastChar = title.charAt(length - 1);
//        String[] token = title.split(" ");
//
//        StringBuffer sb0 = new StringBuffer(author);
//        sb0.append(title);
//
//        StringBuilder sb = new StringBuilder(author);
//        sb.append(title);
//
//        System.out.println(sb0);
//        System.out.println(sb);
//
//        System.out.println(author + title);


        boolean x  = isPalindrome("1");
        System.out.println(x);
    }

    private static void reverse(String message) {
        for (int i = message.length() - 1; i >= 0; i--) {
            System.out.print(message.charAt(i));
        }
        System.out.println("1111");
    }

    private static boolean isPalindrome(String message) {
        //implement an algorithm to check if a word is a palindrome
          boolean palindrome = true;//keep track of the palindrome status
        if (message != null) {
            if(message.length()==1) return false;
            
            int k = 0;
          
            int x = message.length() - 1;
            while (k < message.length() && palindrome) {//
                palindrome = (message.charAt(k) == message.charAt(x));
                k++;
                x--;
            }
        }
        return palindrome;
    }

}
