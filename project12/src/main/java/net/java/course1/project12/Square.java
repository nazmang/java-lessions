/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.java.course1.project12;

import java.util.Scanner;

/**
 *
 * @author nazman
 */
public class Square extends Rectangle {
    
//    protected Square(double w){
//        width = w;
//        height = w;
//    }       
    
    @Override
    public void Construct(){
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Вы выбрали квадрат\nВведите длину грани: ");
        width = reader.nextDouble();
        height = width;
    }
    /**
     *
     * @param width
     */
    @Override
    public void setWidth(double width) {
        this.width = width;
        this.height = width;
    }

    @Override
    public void setHeight(double height) {
        this.height = height;
        this.width = height;
    }
    
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder("Это квадрат со стороной: " + width);
        str.append("\nИмеет плошадь: ").append(this.getSquare());
        str.append("\nИмеет периметр: ").append(this.getPerimeter());
        return  str.toString(); 
    }    
}
