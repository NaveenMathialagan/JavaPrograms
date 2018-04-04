/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

/**
 *
 * @author Naveen
 */
import java.util.*;
public class CollectionMethod {
     public static void main(String[] args)
    {
        // Let us create a list of strings
        List<String>  mylist = new ArrayList<String>();
        mylist.add("practice");
        mylist.add("code");
        mylist.add("quiz");
        mylist.add("geeksforgeeks");
 
        System.out.println("Original List : " + mylist);
 
        // Here we are using reverse() method
        // to reverse the element order of mylist
        Collections.reverse(mylist);
 
        System.out.println("Modified List: " + mylist);
        
        //==================Reverse==============================
        
        List al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(10);
        al.add(20);
 
        // 10 is present at index 3.
        int index = Collections.binarySearch(al, 10);
        System.out.println(index);
 
        // 13 is not present. 13 would have been inserted
        // at position 4. So the function returns (-4-1) 
        // which is -5.
        index = Collections.binarySearch(al, 15);
        System.out.println(index);
        
    //========================Sort===============================
    
     // Create a list of strings
        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("Geeks For Geeks");
        al1.add("Friends");
        al1.add("Dear");
        al1.add("Is");
        al1.add("Superb");
 
        /* Collections.sort method is sorting the
        elements of ArrayList in ascending order. */
        Collections.sort(al1);
 
        // Let us print the sorted list
        System.out.println("List after the use of" +
                           " Collection.sort() :\n" + al1);
        
       //=========================Rotate==========================
       
       
        // Let us create a list of strings
        List<String>  ml = new ArrayList<String>();
        ml.add("practice");
        ml.add("code");
        ml.add("quiz");
        ml.add("geeksforgeeks");
  
        System.out.println("Original List : " + ml);
  
        // Here we are using rotate() method
        // to rotate the element by distance 2
        Collections.rotate(ml, 1);
  
        System.out.println("Rotated List: " + ml);
     
        //=================Disjoint==========================
         // Let us create array list of strings
        List<String>  mylist1 = new ArrayList<String>();
        mylist1.add("practice");
        mylist1.add("code");
        mylist1.add("quiz");
        mylist1.add("geeksforgeeks");
         
        // Let us create vector of strings
        List<String>  mylist2 = new Vector<String>();
        mylist2.add("geeks");
        mylist2.add("geek");
        mylist2.add("for");
        mylist2.add("coder");
         
        // Let us create a vector 
        List mylist3 = new Vector();
         
        mylist3.add(1); 
        mylist3.add("practice");     
         
        // Let us create a Set of strings
        Set<String>  mylist4 = new HashSet<String>();
        mylist4.add("practice");
        mylist4.add("code");
        mylist4.add("quiz");
        mylist4.add("geeksforgeeks");
         
         
        // Here we are using disjoint() method to check 
        // whether two collections are disjoint or not
        System.out.println("is mylist1 disjoint to mylist2 : " +
                            Collections.disjoint(mylist1, mylist2));
         
        System.out.println("is mylist1 disjoint to mylist3 : " +
                            Collections.disjoint(mylist1, mylist3));
         
        System.out.println("is mylist1 disjoint to mylist4 : " +
                            Collections.disjoint(mylist1, mylist4));
        
      // Let us create  arrays of integers
        Integer arr1[] = {10, 20, 30, 40, 50};
        Integer arr2[] = {60, 70, 80, 90, 100};
        Integer arr3[] = {50, 70, 80, 90, 100};
        Double  arr4[] = {50.0, 60.0, 110.0};
         
         
        // Please refer below post for details of asList()
        // http://www.geeksforgeeks.org/array-class-in-java/
        // Here we are using disjoint() method to check 
        // whether two arrays are disjoint or not
        System.out.println("is arr1 disjoint to arr2 : " +
                         Collections.disjoint(Arrays.asList(arr1), Arrays.asList(arr2)));
         
        System.out.println("is arr1 disjoint to arr3 : " +
                         Collections.disjoint(Arrays.asList(arr1), Arrays.asList(arr3)));
         
        System.out.println("is arr1 disjoint to arr4 : " +
                         Collections.disjoint(Arrays.asList(arr1), Arrays.asList(arr4)));
    
    //===========================Frequency=======================================
    // Let us create a list of strings
        List<String>  mylis = new ArrayList<String>();
        mylis.add("practice");
        mylis.add("code");
        mylis.add("code");
        mylis.add("quiz");
        mylis.add("geeksforgeeks");
  
        // Here we are using frequency() method
        // to get  frequency of element "code"
        int freq = Collections.frequency(mylis, "code");
  
        System.out.println(freq);
        
     //======================ReverseOrder==================================
     // Create a list of Integers
        ArrayList<Integer> alis = new ArrayList<Integer>();
        alis.add(30);
        alis.add(20);
        alis.add(10);
        alis.add(40);
        alis.add(50);
 
        /* Collections.sort method is sorting the
        elements of ArrayList in descending order. */
        Collections.sort(alis, Collections.reverseOrder());
 
        // Let us print the sorted list
        System.out.println("List after the use of Collection.reverseOrder()"+
                           " and Collections.sort() :\n" + alis);
      
    }
}
