/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INPUT_AND_OUTPUT;

import java.util.Scanner;

/**
 *
 * @author Naveen
 */
public class ScannerClass {
    public static void main(String args[]){
        // Declare the object and initialize with
        // predefined standard input object
        Scanner sc = new Scanner(System.in);
 
        // String input
        String name = sc.nextLine();
 
        // Character input
        char gender = sc.next().charAt(0);
 
        // Numerical data input
        // byte, short and float can be read
        // using similar-named functions.
        int age = sc.nextInt();
        long mobileNo = sc.nextLong();
        double cgpa = sc.nextDouble();
 
        // Print the values to check if input was correctly obtained.
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("Mobile Number: "+mobileNo);
        System.out.println("CGPA: "+cgpa);
    }
}
