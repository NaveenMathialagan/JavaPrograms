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
 enum Day
  {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY;
  }
enum Color
{
    RED, GREEN, BLUE;
 
    // enum constructor called separately for each
    // constant
    private Color()
    {
        System.out.println("Constructor called for : " +
        this.toString());
    }
 
    // Only concrete (not abstract) methods allowed
    public void colorInfo()
    {
        System.out.println("Universal Color");
    }
}
public class Enumeration2 {
   Day day;
    
    public Enumeration2(Day d){
       this.day=d;
    }
    
    public void dayIsLike()
    {
        switch (day)
        {
        case MONDAY:
            System.out.println("Mondays are bad.");
            break;
        case FRIDAY:
            System.out.println("Fridays are better.");
            break;
        case SATURDAY:
        case SUNDAY:
            System.out.println("Weekends are best.");
            break;
        default:
            System.out.println("Midweek days are so-so.");
            break;
        }
    }
    public static void main(String args[]){
     String str = "MONDAY";
        Enumeration2 t1 = new Enumeration2(Day.valueOf(str));
        t1.dayIsLike();
       Day ar[]=Day.values();
       for(Day d:ar){
          System.out.println(d+" at position "+d.ordinal());
       
       }
       System.out.println(Day.valueOf(str));
       
        Color c1 = Color.RED;
        System.out.println(c1);
        c1.colorInfo();
    }
}
