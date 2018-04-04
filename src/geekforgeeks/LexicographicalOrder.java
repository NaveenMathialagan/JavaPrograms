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
public class LexicographicalOrder {
    public static void main(String argsp[]){
        String[] a={"aa","zbc","ca","aab","abc"};
        //int[] a={5,46,22,6};
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                
                int len=(a[i].length()<a[j].length())?a[i].length():a[j].length();
                for(int k=0;k<len;k++){
                    if(a[i].charAt(k)<a[j].charAt(k)){
                        break;
                    }
                    if(a[i].charAt(k)>a[j].charAt(k)){
                        String tmp=a[i];
                        a[i]=a[j];
                        a[j]=tmp;
                        break;
                    }
                }
                
            }
        }
        
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
