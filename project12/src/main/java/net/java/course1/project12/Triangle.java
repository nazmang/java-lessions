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
public class Triangle implements Shape, Construct {

    protected double _a, _b, _c;

    public Triangle() {
        _a = _b = _c = 0;
        Construct();
    }

    @Override
    public void Construct() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Вы выбрали треугольник\nВведите длину первой стороны: ");
        _a = reader.nextDouble();
        System.out.println("Введите длину второй стороны: ");
        _b = reader.nextDouble();
        System.out.println("Введите длину третьей стороны: ");
        _c = reader.nextDouble();
    }

//    public Triangle(double a, double b, double c) {
//        _a = a;
//        _b = b;
//        _c = c;
//    }
    public double getA() {
        return _a;
    }

    public void setA(double _a) {
        this._a = _a;
    }

    public double getB() {
        return _b;
    }

    public void setB(double _b) {
        this._b = _b;
    }

    public double getC() {
        return _c;
    }

    public void setC(double _c) {
        this._c = _c;
    }

    public double getSquare() {
        double p = 0.5 * (_a + _b + _c);
        double h = p * (p - _a) * (p - _b) * (p - _c);
        double result;
        if (Double.compare(h, 0d) >= 0) {
            result = Math.sqrt(h);
        } else {
            return 0;
        }
        return result;
    }

    public double getPerimeter() {
        return (_a + _b + _c);
    }

    public String toString() {
        StringBuilder str = new StringBuilder("Это треугольник со сторонами: " + getA() + " " + getB() + " " + getC());
        str.append("\nИмеет плошадь: ").append(this.getSquare());
        str.append("\nИмеет периметр: ").append(this.getPerimeter());
        return str.toString();
    }

}
