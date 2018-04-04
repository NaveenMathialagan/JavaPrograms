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
class Complex {
    private double re, im;    
     
    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }
}
public class OverridingEqual {
    public static void main(String args[]){
        Complex c1 = new Complex(10, 15);
        Complex c2 = new Complex(10, 15);
        if (c1 == c2) {
            System.out.println("Equal ");
        } else {
            System.out.println("Not Equal ");
        }
    }
}
