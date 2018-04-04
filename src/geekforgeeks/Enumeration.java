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
public class Enumeration {
    enum Color
    {
        RED,BLUE,GREEN;
    }
    
    public static void main(String args[]){
       Color c=Color.GREEN;
       System.out.println(c);
    }
}
