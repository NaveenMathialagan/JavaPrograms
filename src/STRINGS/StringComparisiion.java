/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package STRINGS;

/**
 *
 * @author Naveen
 */
public class StringComparisiion {
    public static void main(String args[]){
          String s1 = "Ram";
        String s2 = "Ram";
        String s3 = new String("Ram");
        String s4 = new String("Ram");
        String s5 = "Shyam";
        String nulls1 = null;
        String nulls2 = null;
 
        System.out.println(" Comparing strings with equals:");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s5));
 
        System.out.println(" Comparing strings with ==:");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s4);
 
        System.out.println(" Comparing strings with compareto:");
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s5));
    }
}
