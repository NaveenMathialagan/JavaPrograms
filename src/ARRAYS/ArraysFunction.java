/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARRAYS;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Naveen
 */
public class ArraysFunction {
    public static void main(String args[]){
          int ar[] = {4, 6, 1, 8, 3, 9, 7, 4, 2};
         
        // To print the elements in one line
        System.out.println(Arrays.toString(ar));
        String s=Arrays.toString(ar);
        System.out.println(s.charAt(0));
        s=s.replace(", ","");
        s=s.replace("[","");
        s=s.replace("]","");
        System.out.println(s);
      
        //=====================================================
        
         int ar1[] = {4, 6, 1, 8, 3, 9, 7, 4, 2};
 
        // To sort a specific range of array in 
        // ascending order.
        Arrays.sort(ar1, 0, 4);
        System.out.println("Sorted array in range" + 
               " of 0-4 =>\n" + Arrays.toString(ar1));
 
        // To sort the complete array in ascending order.
        Arrays.sort(ar);
        System.out.println("Completely sorted order =>\n"
                                  + Arrays.toString(ar1));
        
       //========================================================
       
       int ar2[] = {4, 6, 1, 8, 3, 9, 7, 4, 2};
         
        // Sort the complete array in ascending order
        // so that Binary Search can be applied
        Arrays.sort(ar2);
 
        // To search for a particular value(for eg 9)
        // use binarysearch method of arrays
        int index = Arrays.binarySearch(ar2,20);
        System.out.println("Position of 9 in sorted"+
                         " arrays is => \n" + index);
        
     //=========================================================
     int ar3[] = {4, 6, 1, 8, 3, 9, 7, 4, 2};
 
        // Copy the whole array
        int[] copy = Arrays.copyOf(ar3, ar3.length);
        System.out.println("Copied array => \n" + 
                           Arrays.toString(copy));
 
        // Copy a specified range into a new array.
        int[] rcopy = Arrays.copyOfRange(ar3, 1, 5);
        System.out.println("Copied subarray => \n" + 
                           Arrays.toString(rcopy));
     
     //====================================================
      int ar4[] = {4, 6, 1, 8, 3, 9, 7, 4, 2};
 
        // To fill a range with a particular value
        Arrays.fill(ar4, 0, 3, 0);
        System.out.println("Array filled with 0 "+
          "from 0 to 3 => \n" + Arrays.toString(ar4));
 
        // To fill complete array with a particular
        // value
        Arrays.fill(ar4, 10);
        System.out.println("Array completely filled"+
                  " with 10=>\n"+Arrays.toString(ar4));
        
    //======================================================
    Integer ar5[] = {4, 6, 1, 8, 3, 9, 7, 4, 2};
 
        // Creates a wrapper list over ar[]
        List<Integer> l1 = Arrays.asList(ar5);
 
        System.out.println(l1);
        
    //=======================================================
     int arr1[] = {1, 2, 3};
        int arr2[] = {1, 2, 3};
        if (Arrays.equals(arr1, arr2))
            System.out.println("Same");
        else
            System.out.println("Not same");
        
     //========================================================
      int inarr1[] = {1, 2, 3};
        int inarr2[] = {1, 2, 3}; 
        Object[] ob1 = {inarr1};  // arr1 contains only one element
        Object[] ob2 = {inarr2};  // arr2 also contains only one element
        if (Arrays.deepEquals(ob1, ob2))
            System.out.println("Same");
        else
            System.out.println("Not same");
        
     //===========================================================
     
        // Create a 2D array
        int[][] mat = new int[2][2];
        mat[0][0] = 99;
        mat[0][1] = 151;
        mat[1][0] = 30;
        mat[1][1] = 5;
 
        // print 2D integer array using deepToString()
        System.out.println(Arrays.deepToString(mat));
      //==============================================
      // Note that we have Integer here instead of
        // int[] as Collections.reverseOrder doesn't
        // work for primitive types.
        Integer[] arr = {13, 7, 6, 45, 21, 9, 2, 100};
 
        // Sorts arr[] in descending order
        Arrays.sort(arr, Collections.reverseOrder());
 
        System.out.printf("Modified arr[] : %s",
                          Arrays.toString(arr));
    }
}
