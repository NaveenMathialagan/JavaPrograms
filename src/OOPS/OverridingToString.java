/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPS;

/**
 *
 * @author Naveen
 */
class Complex1 {  
    private double re, im;
 
    public Complex1(double re, double im) {
        this.re = re;
        this.im = im;
    }
     
    /* Returns the string representation of this Complex number.
       The format of string is "Re + iIm" where Re is real part
       and Im is imagenary part.*/
    @Override
    public String toString() {
        return String.format(re + " + i" + im);
    }
}
 
// Driver class to test the Complex class

public class OverridingToString {
    public static void main(String args[]){
           Complex1 c1 = new Complex1(10, 15);
        System.out.println(c1);
    }
}
