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
public class GeekForGeeks {

    /**
     * @param args the command line arguments
     */
      static
    {
        System.out.println("program is running without main() method");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hai");
        
          outer: //label for outer loop
    for (int i = 0; i < 10; i++) { 
      for (int j = 0; j < 10; j++) {
        if (j == 1)
          break outer;
        System.out.println("value of j = " + j);
      }
    } //end of outer loop
          
          
     //An integer can be null, so this is fine
      Integer i = null;
     //Unboxing null to integer throws NullpointerException
    //  int a = i;
      
      
      int inum = 1_00_00_000;
         System.out.println("inum:" + inum);
 
         long lnum = 1_00_00_000;
         System.out.println("lnum:" + lnum);
 
         float fnum = 2.10_001F;
         System.out.println("fnum:" + fnum);
 
         double dnum = 2.10_12_001;
         System.out.println("dnum:" + dnum);
    }
    
    
    //unboxing
    
}
