/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author Naveen
 */
public class SortedMapDemo {
    public static void main(String[] args)
    {
        SortedMap<Integer, String> sm =
                    new TreeMap<Integer, String>();
        sm.put(new Integer(2), "practice");
        sm.put(new Integer(3), "quiz");
        sm.put(new Integer(5), "code");
        sm.put(new Integer(4), "contribute");
        sm.put(new Integer(1), "geeksforgeeks");
        Set s = sm.entrySet();
 
        // Using iterator in SortedMap
        Iterator i = s.iterator();
 
        // Traversing map. Note that the traversal
        // produced sorted (by keys) output .
        while (i.hasNext())
        {
            Map.Entry m = (Map.Entry)i.next();
 
            int key = (Integer)m.getKey();
            String value = (String)m.getValue();
 
            System.out.println("Key : " + key +
                            "  value : " + value);
        }
    }
}
