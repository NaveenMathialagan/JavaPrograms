/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geekforgeeks;

/**
 *
 * @author Naveen
 */
public class Operators {
    public static void main(String args[]){
        int a=10;
        int c=0;
        c=a++;
        System.out.println(c);
        c=++a;
        System.out.println(c);
        c=a--;
        System.out.println(c);
        c=--a;
        System.out.println(c);
        
        int b = 10, result;
 
        //result holds max of three
        //numbers
        result = ((a > b) ? (a > c) ? a : c:(b > c) ? b : c);
        System.out.println("Max of three numbers = "+result);
    }
}
