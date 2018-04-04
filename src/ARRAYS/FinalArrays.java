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
public class FinalArrays {
    
public static void main(String args[]){
     final int arr[] = {1, 2, 3, 4, 5};  // Note: arr is final
       for (int i = 0; i < arr.length; i++)
       {
           arr[i] = arr[i]*10;  
           System.out.println(arr[i]);          
       }   
}
}
