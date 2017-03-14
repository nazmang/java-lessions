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
public class Square extends Shape{
    
    protected double length = 0;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


    public Square() {
        setLength(length);
        square = 0;
    }
    
    protected double calcSquare(){
        square = length * length;
        return square;
    }
    
    public String toString() {
        return "Square{" + '}';
    }
    
    
    
}
