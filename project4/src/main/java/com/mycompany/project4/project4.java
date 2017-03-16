/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project4;
import java.util.Arrays;
/**
 *
 * @author yevhen.nazarenko
 */
public class project4 {
    public static void main(String[] args) {
        decompose(992577300);
    }
    
    public static void decompose(int val) {
        
        StringBuilder s = new StringBuilder();
        //Fill array with chars
        for(int temp = val; temp > 0; temp /= 10){
            s.insert(0, temp%10);            
        }        
        //System.out.println(s.toString());  
        //Creating new dynamic array of Integer from Character
        if(s.length() > 0){
            int[] a  = new int[s.length()];
            for(int i = 0; i < a.length; i++){
                a[i] = Character.getNumericValue(s.charAt(i));
                System.out.println(a[i]);
            }
            Arrays.sort(a);
            System.out.println("Smallest: " + a[0]);
            System.out.println("Biggest: " + a[a.length-1]);
        }
        else return;
        
    }
 
}
