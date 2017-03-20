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
public class Rectangle implements Shape, Construct {

    protected double width;
    protected double height;

    /**
     *
     */
    public Rectangle() {
        width = 0d;
        height = 0d;        
        Construct();
    }
    
    @Override
    public void Construct() {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Вы выбрали прямоугольник\nВведите длину первой стороны: ");
        width = reader.nextDouble();
        System.out.println("Введите длину второй стороны: ");
        height = reader.nextDouble();
    }
//    public Rectangle(double w, double h){
//        width = w;
//        height = h;
//    }
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    /**
     *
     * @return
     */
    @Override
    public double getSquare() {
        return width * height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     *
     * @return
     */
    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Это прямоугольник со сторонами: длина " + width + " ширина " + height);
        str.append("\nИмеет плошадь: ").append(this.getSquare());
        str.append("\nИмеет периметр: ").append(this.getPerimeter());
        return str.toString();
    }    

    
}
