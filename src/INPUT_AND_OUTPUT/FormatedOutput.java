/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INPUT_AND_OUTPUT;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Naveen
 */
public class FormatedOutput {
    public static void main(String args[]) throws ParseException{
        double num = 123.4567;
 
    // prints only numeric part of a floating number
    DecimalFormat ft = new DecimalFormat("####");
    System.out.println("Without fraction part: num = " + ft.format(num));
 
    // this will print it upto 2 decimal places
    ft = new DecimalFormat("#.##");
    System.out.println("Formatted to Give precison: num = " + ft.format(num));
 
    // automatically appends zero to the rightmost part of decimal
    // instead of #,we use digit 0
    ft = new DecimalFormat("#.000000");
    System.out.println("appended zeroes to right: num = " + ft.format(num));
 
    // automatically appends zero to the leftmost of decimal number
    // instead of #,we use digit 0
    ft = new DecimalFormat("00000.00");
    System.out.println("formatting Numeric part : num = "+ft.format(num));
 
    // formatting money in dollars
    double income = 23456.789;
    ft = new DecimalFormat("$###,###.##");
    System.out.println("your Formatted Dream Income : " + ft.format(income));
    
    // Formatting as per given pattern in the argument
    SimpleDateFormat ft1 = new SimpleDateFormat("dd-MM-yyyy");
    String str = ft1.format(new Date());
    System.out.println("Formatted Date : " + str);
 
    // parsing a given String
    str = "02/18/1995";
    ft1 = new SimpleDateFormat("MM/dd/yyyy");
    Date date = ft1.parse(str);
 
    // this will print the date as per parsed string
    System.out.println("Parsed Date : " + date);
    }
}
