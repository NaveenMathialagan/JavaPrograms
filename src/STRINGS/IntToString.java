/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package STRINGS;

import java.text.DecimalFormat;

/**
 *
 * @author Naveen
 */
public class IntToString {
    public static void main(String[] args){
         int a = 1234;
    int b = -1234;
    String str1 = Integer.toString(a);
    String str2 = Integer.toString(b);
    System.out.println("String str1 = " + str1); 
    System.out.println("String str2 = " + str2);
    
    int c = 1234;
    String str3 = String.valueOf(c);
    System.out.println("String str3 = " + str3);
    
    int d = 1234;
    Integer obj = new Integer(d);
    String str4 = obj.toString();
    System.out.println("String str4 = " + str4);
    
    int e = 12345;
    DecimalFormat df = new DecimalFormat("#,###");
    String Str5 = df.format(e);
    System.out.println(Str5);
    
    int h = 255;
    String binaryString = Integer.toBinaryString(h);
    System.out.println(binaryString);
    
     int i = 255;
    String octalString = Integer.toOctalString(i);
    System.out.println(octalString);
    
    int j = 255;
    String hexString = Integer.toHexString(j);
    System.out.println(hexString);
    
    int k = 255;
    String customString = Integer.toString(k, 7);
    System.out.println(customString);
    }
}
