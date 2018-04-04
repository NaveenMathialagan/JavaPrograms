/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package REGULAREXPRESSION;

import java.util.regex.Pattern;

/**
 *
 * @author Naveen
 */
public class SplitFunction {
    public static void main(String a[]){
        String text = "geeks1for2geeks3";
 
        // Specifies the string pattern which is to be searched
        String delimiter =  "\\d";
        Pattern pattern = Pattern.compile(delimiter,
                                        Pattern.CASE_INSENSITIVE);
 
        // Used to perform case insensitive search of the string
        String[] result = pattern.split(text);
 
 
        for (String temp: result)
            System.out.println(temp);
    }
}
