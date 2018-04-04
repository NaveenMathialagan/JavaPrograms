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
class Student
{
    public int roll_no;
    public String name;
    Student(int roll_no, String name)
    {
        this.roll_no = roll_no;
        this.name = name;
    }
}
public class ArraysCreation {
      public static int[] m1() 
    {
        // returning  array
        return new int[]{1,2,3};
    }
 public static void main(String args[]){
      int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
      
  //=======================================================    
       // declares an Array of integers.
        Student[] arr;
 
        // allocating memory for 5 objects of type Student.
        arr = new Student[5];
 
        // initialize the first elements of the array
        arr[0] = new Student(1,"aman");
 
        // initialize the second elements of the array
        arr[1] = new Student(2,"vaibhav");
 
        // so on...
        arr[2] = new Student(3,"shikar");
        arr[3] = new Student(4,"dharmesh");
        arr[4] = new Student(5,"mohit");
 
        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at " + i + " : " +
                        arr[i].roll_no +" "+ arr[i].name);
 
  //=========================================================
        // declaring and initializing 2D array
        int arr1[][] = { {2,7,9},{3,6,1},{7,4,2} };
 
        // printing 2D array
        for (int i=0; i< 3 ; i++)
        {
            for (int j=0; j < 3 ; j++)
                System.out.print(arr1[i][j] + " ");
 
            System.out.println();
        }
        
         int arr2[] = m1();
         
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
  
        //================================================
         int intArray1[] = {1,2,3};
         
        int cloneArray[] = intArray1.clone();
         
        // will print false as deep copy is created
        // for one-dimensional array
        System.out.println((intArray1==cloneArray));
         
        for (int i = 0; i < cloneArray.length; i++) {
            System.out.print(cloneArray[i]+" ");
        }
     
 }   
}
