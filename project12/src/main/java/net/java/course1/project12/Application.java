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
public class Application {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);  // Reading from System.in

        boolean isExit = false;

        while (!isExit) {
            menu();
            int choise = reader.nextInt();
            //System.out.println("Выш выбор " + choise);
            switch (choise) {
                case 1: {
                    
                    Square sq = new Square();
                    System.out.println(sq.toString());
                    break;
                }
                case 2: {
                   
                    Rectangle rect = new Rectangle();
                    System.out.println(rect.toString());
                    break;
                }
                case 3: {
                    
                    Circle cir = new Circle();
                    System.out.println(cir.toString());
                    break;
                }
                case 4: {
                    
                    Triangle tr = new Triangle();
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
