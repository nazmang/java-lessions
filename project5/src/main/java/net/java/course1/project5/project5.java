/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.java.course1.project5;

/**
 *
 * @author yevhen.nazarenko
 */
public class project5 {

    public static void main(String[] args) {
        System.out.println("");
        
        printFrame("Череззаборногузадерищенко", "Илларион", "Эммануилович");
        printFrame("Ия", "Элла", "Ионовна");
    }

    public static void printFrame(String l, String f, String p) {

        StringBuilder fio = new StringBuilder();
        fio.append(l).append(" ").append(f).append(" ").append(p);

        StringBuilder level = new StringBuilder();
        level.append("Курс: Java level 1");

        StringBuilder stud = new StringBuilder();
        stud.append("Студент");

        StringBuilder frame = new StringBuilder();

        if (fio.length() >= level.length()) {

            long ll = fio.length() - level.length();
            if (ll % 2 != 0) {
                level.insert(0, " ");
            }
            for (int i = 0; i < ll / 2; i++) {
                level.insert(0, " ");
                level.insert(level.length() - i, " ");
            }
            long ls = fio.length() - stud.length();
            if (ls % 2 != 0) {
                stud.insert(0, " ");
            }
            for (int i = 0; i < ls / 2; i++) {
                stud.insert(0, " ");
                stud.insert(stud.length() - i, " ");
            }

        } else {
            long ll = level.length() - fio.length();
            if (ll % 2 != 0) {
                fio.insert(0, " ");
            }
            for (int i = 0; i < ll / 2; i++) {
                fio.insert(0, " ");
                fio.insert(fio.length() - i, " ");
            }
            long ls = level.length() - stud.length();
            if (ls % 2 != 0) {
                stud.insert(0, " ");
            }
            for (int i = 0; i < ls / 2; i++) {
                stud.insert(0, " ");
                stud.insert(stud.length() - i, " ");
            }
        }

        level.insert(0, "*  ");
        level.insert(level.length(), "  *");
        fio.insert(0, "*  ");
        fio.insert(fio.length(), "  *");
        stud.insert(0, "*  ");
        stud.insert(stud.length(), "  *");
        for (int i = 0; i < fio.length(); i++) {
            frame.append("*");
        }
        System.out.println(frame.toString());
        System.out.println(level.toString());
        System.out.println(stud.toString());
        System.out.println(fio.toString());
        System.out.println(frame.toString());
    }

}
