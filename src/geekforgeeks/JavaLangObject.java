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
public class JavaLangObject {
    public static void main(String args[]){
        Object o;
        o='c';
        System.out.println(o.getClass().getName());
        o="SSS";
        System.out.println(o.getClass().getName());
        o=10;
        System.out.println(o.getClass().getName());
    }
}
