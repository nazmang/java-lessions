/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.java.course1.shape;

import java.util.Scanner;

/**
 *
 * @author yevhen.nazarenko
 */
public class Shape {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);  // Reading from System.in

        boolean isExit = false;

        while (!isExit) {
            menu();
            int choise = reader.nextInt();
            //System.out.println("Выш выбор " + choise);
            switch (choise) {
                case 1: {
                    System.out.println("Вы выбрали квадрат\nВведите длину грани: ");
                    double size = reader.nextDouble();
                    Square sq = new Square(size);
                    System.out.println(sq.toString());
                    break;
                }
                case 2: {
                    System.out.println("Вы выбрали прямоугольник\nВведите длину первой стороны: ");
                    double a = reader.nextDouble();
                    System.out.println("Введите длину второй стороны: ");
                    double b = reader.nextDouble();
                    Rectangle rect = new Rectangle(a, b);
                    System.out.println(rect.toString());
                    break;
                }
                case 3: {
                    System.out.println("Вы выбрали круг\nВведите раадиус: ");
                    double rad = reader.nextDouble();
                    Circle cir = new Circle(rad);
                    System.out.println(cir.toString());
                    break;
                }
                case 4: {
                    System.out.println("Вы выбрали треугольник\nВведите длину первой стороны: ");
                    double a = reader.nextDouble();
                    System.out.println("Введите длину второй стороны: ");
                    double b = reader.nextDouble();
                    System.out.println("Введите длину третьей стороны: ");
                    double c = reader.nextDouble();
                    Triangle tr = new Triangle(a, b, c);
                    System.out.println(tr.toString());
                    break;
                }
                case 5: {
                    System.out.println("Завершение...");
                    isExit = true;
                    break;
                }
                default: {
                    System.out.println("Неправильный ввод!");
                    break;
                }
            }

        }
       
        reader.close();

    }

    public static void menu() {
        System.out.println("Выберите фигуру:\n"
                + "1. Квадрат\n"
                + "2. Прямоугольник\n"
                + "3. Круг \n"
                + "4. Треугольник\n"
                + "5. Выход");
    }
}
