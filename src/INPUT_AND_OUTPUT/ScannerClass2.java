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
public class ScannerClass2 {
    public static void main(String args[]){
    
              // predefined standard input object
        Scanner sc = new Scanner(System.in);
 
        // Initialize sum and count of input elements
        int sum = 0, count = 0;
 
        // Check if an int value is available
        while (sc.hasNextInt())
        {
            // Read an int value
            int num = sc.nextInt();
            sum += num;
            count++;
        }
        int mean = sum / count;
        System.out.println("Mean: " + mean);
    }
}
