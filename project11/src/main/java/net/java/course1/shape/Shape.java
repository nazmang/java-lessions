/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.java.course1.shape;

/**
 *
 * @author yevhen.nazarenko
 */
public class Shape {
    
    public static void main(String[] args) {
        Square sq = new Square(14);
        Rectangle r = new Rectangle(14,15);
       sq.setWidth(11);
        System.out.println(r.toString());
        System.out.println(sq.toString());
        
       
    }
    
    public static void menu(){
        
    }
}
