/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.java.course1.project8;

import java.util.Scanner;

/**
 *
 * @author nazman
 */
public class Project8 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Введите строку: ");
        String inputString = reader.nextLine();
        boolean isExit = false;
        
        if (!inputString.isEmpty()) {
           
            while (!isExit) {
                printMenu();
                String choise = reader.nextLine().toLowerCase();
                //System.out.println("Выш выбор " + choise);
                switch (choise.charAt(0)) {
                    case 'a': {
                        System.out.println("Полученная строка: " + toUpperFull(inputString));
                        break;
                    }
                    case 'b': {
                        System.out.println("Полученная строка: " + toLowerFull(inputString));
                        break;
                    }
                    case 'c': {
                        System.out.println("Полученная строка: " + toUpEach(inputString));
                        break;
                    }
                    case 'd': {
                        System.out.println("Полученная строка: " + toLowEach(inputString));
                        break;
                    }
                    case 'e': {
                        System.out.println("Полученная строка: " + toUpBegin(inputString));
                        break;
                    }
                    case 'f': {
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
        }
        else {
            System.out.println("Введена пустая срока!");
        }
           reader.close();
    }

    /* Converts all words to UPPER */
    public static String toUpperFull(String s) {
        return s.toUpperCase();
    }

    /* Converts all words to LOWER */
    public static String toLowerFull(String s) {
        return s.toLowerCase();
    }

    /* Coverts first letter to UPPER in each word */
    public static String toUpEach(String s) {
        
        StringBuilder sb = new StringBuilder();
        
        for (String str : s.split(" ")) {
            sb.append(toUpFirst(str)).append(" ");
           
        }

        return sb.toString();
    }

    /* Coverts first letter to LOWER in each word */
    public static String toLowEach(String s) {
       StringBuilder sb = new StringBuilder();

        for (String str : s.split(" ")) {
            sb.append(toLowFirst(str.toUpperCase())).append(" ");
        }
        
        return sb.toString();
    }

    /* Coverts first letter to UPPER at the begining of sentence */
    public static String toUpBegin(String s) {
        
        StringBuilder sb = new StringBuilder(s.toLowerCase());
        sb.replace(0, 1, s.substring(0, 1).toUpperCase() );
           
        return sb.toString();
    }

    /* Coverts first letter to UPPER */
    public static String toUpFirst(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.substring(0, 1).toUpperCase());
        sb.append(s.substring(2));
        return sb.toString();

    }

    /* Converts first letter to LOWER*/
    public static String toLowFirst(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.substring(0, 1).toLowerCase());
        sb.append(s.substring(2));
        return sb.toString();
    }

    /* Prints main menu */
    public static void printMenu() {
        System.out.println("A. СТРОКА ЗАГЛАВНЫМИ БУКВАМИ\n"
                + "B. строка в нижнем регистре\n"
                + "C. С Заглавной Буквы (Первый Символ Каждого Слова В Строке )\n"
                + "D. пЕРВЫЙ сИМВОЛ в нИЖНЕМ рЕГИСТРЕ\n"
                + "E. Как в предложении(с заглавной буквы).\n"
                + "F. Выход из программы");
    }

}
