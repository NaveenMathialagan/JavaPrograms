/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package METHODS;

/**
 *
 * @author Naveen
 */
class MultiDiv
{
    int mul;    // To store multiplication
    double div; // To store division
    MultiDiv(int m, double d)
    {
        mul = m;
        div = d;
    }
}
public class ReturningMultipleVal {
   static MultiDiv getMultandDiv(int a, int b)
    {
        // Returning multiple values of different
        // types by returning an object
        return new MultiDiv(a*b, (double)a/b);
    }
 
    // Driver code
    public static void main(String[] args)
    {
        MultiDiv ans = getMultandDiv(10, 20);
        System.out.println("Multiplication = " + ans.mul);
        System.out.println("Division = " + ans.div);
    }
}
