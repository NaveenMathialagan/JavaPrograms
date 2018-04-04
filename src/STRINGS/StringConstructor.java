/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package STRINGS;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/**
 *
 * @author Naveen
 */
public class StringConstructor {
    public static void main(String args[]) throws UnsupportedEncodingException{
        
        byte[] b_arr = {71, 101, 101, 107, 115};
        String s_byte =new String(b_arr); //Geeks
        System.out.println(s_byte);
        
       // byte[] b_arr1 = {71, 101, 101, 107, 115};
        Charset cs = Charset.defaultCharset();
        String s_byte_char = new String(b_arr, cs); //Geeks
        
        String s = new String(b_arr, "US-ASCII"); //Geeks

        String s1 = new String(b_arr, 1, 3); // eek
        
        //Charset cs = Charset.defaultCharset();
        String s2 = new String(b_arr, 1, 3, cs); // eek
        
        String s3 = new String(b_arr, 1, 4, "US-ASCII"); // eeks
        
        char char_arr[] = {'G', 'e', 'e', 'k', 's'};
        String s4 = new String(char_arr); //Geeks

        
        String s5 = new String(char_arr , 1, 3); //eek
        
        int[] uni_code = {71, 101, 101, 107, 115};
        String s6 = new String(uni_code, 1, 3); //eek
        
        String s_buffer = "Geeks";
        String s7 = new String(s_buffer); //Geeks
        
        String s_builder = "Geeks";
        String s8 = new String(s_builder); //Geeks
        
    }
}
