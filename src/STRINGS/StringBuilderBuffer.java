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
public class StringBuilderBuffer {
    public static void concat1(String s1)
    {
        s1 = s1 + "forgeeks";
    }
 
    // Concatenates to StringBuilder
    public static void concat2(StringBuilder s2)
    {
        s2.append("forgeeks");
    }
 
    // Concatenates to StringBuffer
    public static void concat3(StringBuffer s3)
    {
        s3.append("forgeeks");
    }
    
    public static void main(String args[]){
        String s1 = "Geeks";
        concat1(s1);  // s1 is not changed
        System.out.println("String: " + s1);
 
        StringBuilder s2 = new StringBuilder("Geeks");
        concat2(s2); // s2 is changed
        System.out.println("StringBuilder: " + s2);
 
        StringBuffer s3 = new StringBuffer("Geeks");
        concat3(s3); // s3 is changed
        System.out.println("StringBuffer: " + s3);
        
        
        String str = "Geeks";
         
        // conversion from String object to StringBuffer
        StringBuffer sbr = new StringBuffer(str);
        sbr.reverse();
        System.out.println(sbr);
         
        // conversion from String object to StringBuilder
        StringBuilder sbl = new StringBuilder(str);
        sbl.append("ForGeeks");
        System.out.println(sbl);
        
     
         
        // conversion from StringBuffer object to String
         str = sbr.toString();
        System.out.println(str);
         
        // conversion from StringBuilder object to String
        String str1 = sbr.toString();
        System.out.println(str1);
         
        // changing StringBuffer object sbr
        // but String object(str) doesn't change
        sbr.append("ForGeeks");
        System.out.println(sbr);
        System.out.println(str);
        
        //  StringBuffer sbr = new StringBuffer("Geeks");
         
        // conversion from StringBuffer object to StringBuilder
        str = sbr.toString();
        StringBuilder sb2 = new StringBuilder(str);
         
        System.out.println(sb2);
    }
}
