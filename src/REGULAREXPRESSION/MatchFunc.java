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
public class MatchFunc {
    public static void main(String args[]){
        // Following line prints "true" because the whole
        // text "geeksforgeeks" matches pattern "geeksforge*ks"
        System.out.println (Pattern.matches("geeksforge*ks",
                                            "geeksforgeeks"));
 
        // Following line prints "false" because the whole
        // text "geeksfor" doesn't match pattern "g*geeks*"
        System.out.println (Pattern.matches("g*geeks*",
                                            "geeksfor"));
    }
}
