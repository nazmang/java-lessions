/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.java.course1.shape;

/**
 *
 * @author nazman
 */
public class Square extends Rectangle{
    
    Square(double w){
        width = w;
        height = w;
    }       

    public void setWidth(double width) {
        this.width = width;
        this.height = width;
    }

    public void setHeight(double height) {
        this.height = height;
        this.width = height;
    }
    
    public String toString(){
        StringBuilder str = new StringBuilder("Это квадрат со стороной: " + width);
        str.append("\nИмеет плошадь: ").append(this.getSquare());
        str.append("\nИмеет периметр: ").append(this.getPerimeter());
        return  str.toString(); 
    }    
}
