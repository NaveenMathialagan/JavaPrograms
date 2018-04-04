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
public class StringFunction {
    public static void main(String args[]){
        System.out.println( "GeeksforGeeks".length() );  // returns 13
        
        System.out.println("GeeksforGeeks".charAt(3)); // returns  ‘k’
        
        System.out.println("GeeksforGeeks".substring(3));    // returns “ksforGeeks”
        
        System.out.println( "GeeksforGeeks".substring(2, 5)); // returns “eks”
        
        String s1 = "Geeks";
        String s2 = "forGeeks";
        String output = s1.concat(s2);
        System.out.println(output);
        
         String s ="Learn Share Learn";
        int output1 = s.indexOf("Share");
        System.out.println(output1);
        
        String s3 = "Learn Share Learn";
        int output3 = s.indexOf('a',3);// returns 8
        System.out.println(output3);
        
        String s4 = "Learn Share Learn";
        int output4 = s4.lastIndexOf('a'); // returns 14
        System.out.println(output4);
        
        Boolean out = "Geeks".equals("Geeks"); // returns true
        Boolean out1 = "Geeks".equals("geeks"); // returns false
        
         Boolean out2= "Geeks".equalsIgnoreCase("Geeks"); // returns true
        Boolean out3 = "Geeks".equalsIgnoreCase("geeks"); // returns true
       
        
         int out5 = s1.compareTo(s2);  // where s1 ans s2 are
                             // strings to be compared

             /*This returns difference s1-s2. If :
             out < 0  s1 comes before s2
             out = 0  s1 and s2 are equal.
             out >0    s1 comes after s2.*/
        
       int out4 = s1.compareToIgnoreCase(s2);  
        // where s1 ans s2 are 
        // strings to be compared

        /*This returns difference s1-s2. If :
        out < 0  // s1 comes before s2
        out = 0   // s1 and s2 are equal.
        out >0   // s1 comes after s2.*/
        
        String word1 = "HeLLo";
        String word3 = word1.toLowerCase(); // returns “hello"
        
        String word4 = "HeLLo";
        String word2 = word1.toUpperCase(); // returns “HELLO”
        
        String word5 = " Learn Share Learn ";
        word2 = word5.trim(); // returns “Learn Share Learn”

        String s5 = "feeksforfeeks";
        String s6 = "feeksforfeeks".replace('f' ,'g'); // returns “geeksgorgeeks”
        
        String str = "geekss@for@geekss";
        String [] arrOfStr = str.split("@", 2);
 
        for (String a : arrOfStr)
            System.out.println(a);
        
        String str1 = "geekss@for@geekss";
        String [] arrOfStr1 = str1.split("@", 5);
 
        for (String a : arrOfStr1)
            System.out.println(a);
        
    }
}
