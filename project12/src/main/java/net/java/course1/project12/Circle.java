/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.java.course1.project12;

import java.util.Scanner;

/**
 *
 * @author yevhen.nazarenko
 */
public class Circle implements Shape, Construct {

    private double radius;

    public Circle() {
        radius = 0;
        Construct();
    }
    
    @Override
    public void Construct() {
       Scanner reader = new Scanner(System.in);
       System.out.println("Вы выбрали круг\nВведите раадиус: ");
       radius = reader.nextDouble();
    }
    
//    public Circle(double r) {
//        radius = r;
//    }

    /**
     * Get the value of radius
     *
     * @return the value of radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Set the value of radius
     *
     * @param radius new value of radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSquare() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return Math.PI * radius;
    }
    
    public String toString(){
        StringBuilder str = new StringBuilder("Это круг с радиусом: " + getRadius());
        str.append("\nИмеет плошадь: ").append(this.getSquare());
        str.append("\nИмеет периметр: ").append(this.getPerimeter());
        return  str.toString(); 
    }

    
}
