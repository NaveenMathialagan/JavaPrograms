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
public class ReturnChar {
    public void convert(int n){
        char[] str=new char[50];
        int i=0;
          while (n>0)
    {
        // Find remainder
        int rem = n%26;
 
        // If remainder is 0, then a 'Z' must be there in output
        if (rem==0)
        {
            str[i++] = 'Z';
            n = (n/26)-1;
        }
        else // If remainder is non-zero
        {
            str[i++] = (char)((rem-1) + 'A');
            n = n/26;
        }
    }
          for(int k=i;k>=0;k--){
              System.out.print(str[k]);
          }
          System.out.println();
    }
    public static void main(String... args){
        
         ReturnChar rc=new ReturnChar();
         rc.convert(23);    
    }
}
