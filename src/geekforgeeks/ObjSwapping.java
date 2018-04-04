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
class Car
{
    int model, no;
 
    // Constructor
    Car(int model, int no)
    {
        this.model = model;
        this.no = no;
    }
 
    // Utility method to print object details
    void print()
    {
        System.out.println("no = " + no + 
                           ", model = " + model);
    }
}
 
// A Wrapper over class that is used for swapping
class CarWrapper
{
   Car c;
 
   // Constructor
   CarWrapper(Car c)  
   {
       this.c = c;
   }
}
public class ObjSwapping {
    public static void swap(CarWrapper cw1, 
                            CarWrapper cw2)
    {
        Car temp = cw1.c;
        cw1.c = cw2.c;
        cw2.c = temp;
    }
    public static void main(String args[]){
        Car c1 = new Car(101, 1);
        Car c2 = new Car(202, 2);
        CarWrapper cw1 = new CarWrapper(c1);
        CarWrapper cw2 = new CarWrapper(c2);
        swap(cw1, cw2);
        cw1.c.print();
        cw2.c.print();
    }
}
