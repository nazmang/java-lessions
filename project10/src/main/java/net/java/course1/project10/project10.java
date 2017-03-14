/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.java.course1.project10;

import java.util.Scanner;
import java.util.regex.Pattern;
import static java.util.regex.Pattern.CASE_INSENSITIVE;

/**
 *
 * @author nazman
 */
public class project10 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Pattern patfio = Pattern.compile("^[а-яА-ЯёЁЇїІіЄєҐґ'\\s-]*");
        Pattern patmobile = Pattern.compile("[+]380[0-9]{2}[0-9]{7}");
        Pattern patemail = Pattern.compile("^[-a-z0-9~!$%^&*_=+}{\\'?]+(\\.[-a-z0-9~!$%^&*_=+}{\\'?]+)*@([a-z0-9_][-a-z0-9_]*(\\.[-a-z0-9_]+)*\\.([a-z][a-z])|([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}))(:[0-9]{1,5})?$"); 
        System.out.println("Ведите ФИО (допускаются только буквы, дефис и пробел): ");
        String line = reader.nextLine();
        System.out.println("Ведите № телефона в формате +380ХХХХХХХХХ: ");
        String line2 = reader.nextLine();
        System.out.println("Ведите валидный e-mail: ");
        String line3 = reader.nextLine();
        
        if (!patfio.matcher(line).matches()) {
            System.out.println("ФИО введено неправильно! Вы ввели: " + line);
        }
        else{
            System.out.println("Вы ввели ФИО : " + line);
        }
        if (!patmobile.matcher(line2).matches()) {
            System.out.println("№ телефона введен неправильно! Вы ввели: " + line2);
        }
        else{
            System.out.println("Вы ввели № телефона: " + line2);
        }
        if (!patemail.matcher(line3).matches()) {
            System.out.println("e-mail введен неправильно! Вы ввели: " + line3);
        }
        else{
            System.out.println("Вы ввели e-mail: " + line3);
        }

    }

}
