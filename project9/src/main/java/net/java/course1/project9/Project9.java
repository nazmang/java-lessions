/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.java.course1.project9;

import java.util.Scanner;

/**
 *
 * @author nazman
 */
public class Project9 {
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Введите строку: ");
        String inputString = reader.nextLine();
        charCount(inputString);
    }
    
    public static void charCount(String s) {
        
        long counter = 0;
        System.out.println("В строке встречаются следующие символы: ");
        
        for(int c = 65; c <= 90; c++){
            if((counter = exists(s,(char)c)) > 0)  {
                System.out.printf("\n%c = %d",c,counter);
            }              
        }
        for(int c = 97; c <= 122; c++){
            if((counter = exists(s,(char)c)) > 0)  {
                System.out.printf("\n%c = %d",c,counter);
            }              
        }
        
        
    }
    
    public static long exists(String s , char c){
        
        long count = 0;
        
        for(int i=0 ; i < s.length(); i++){
            if(s.charAt(i) == c){
                count++;
            }
        }
        return count;
    }
}
