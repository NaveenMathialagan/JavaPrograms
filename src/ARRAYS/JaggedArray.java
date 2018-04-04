/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARRAYS;

/**
 *
 * @author Naveen
 */
public class JaggedArray {
 public static void main(String a[]) {
       int ar[][] = new int[2][];
 
        // Making the above aray Jagged
 
        // First row has 3 columns
        ar[0] = new int[3];
 
        // Second row has 2 columns
        ar[1] = new int[2];
 
        // Initializing aray
        int count = 0;
        for (int i=0; i<ar.length; i++)
            for(int j=0; j<ar[i].length; j++)
                ar[i][j] = count++;
 
        // Displaying the values of 2D Jagged aray
        System.out.println("Contents of 2D Jagged Array");
        for (int i=0; i<ar.length; i++)
        {
            for (int j=0; j<ar[i].length; j++)
                System.out.print(ar[i][j] + " ");
            System.out.println();
        }
        
      //=================================================
       int r = 5;
 
        // Declaring 2-D array with 5 rows
        int arr[][] = new int[r][];
 
        // Creating a 2D array such that first row
        // has 1 element, second row has two 
        // elements and so on.
        for (int i=0; i<arr.length; i++)
            arr[i] = new int[i+1];
 
        // Initializing array
        count = 0;
        for (int i=0; i<arr.length; i++)
            for(int j=0; j<arr[i].length; j++)
                arr[i][j] = count++;
 
        // Displaying the values of 2D Jagged array
        System.out.println("Contents of 2D Jagged Array");
        for (int i=0; i<arr.length; i++)
        {
            for (int j=0; j<arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
 }  
}
