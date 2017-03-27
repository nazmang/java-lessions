/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.java.course1.wc;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Pattern;

/**
 *
 * @author yevhen.nazarenko
 */
public class WordCount {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Недостаточно аргументов.");
        } else {
            try {

                Path file = Paths.get(args[0]);
                //Path file = Paths.get("book.txt");
                System.out.println("Всего уникальных слов: " + wordsCount(file));
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
        }

    }

    public static int wordsCount(Path file) throws Exception {

        TreeMap<String, Integer> words = new TreeMap<>();
        Pattern p = Pattern.compile("[^A-Za-z\\p{InCyrillic}]+");

        try (Scanner scan = new Scanner(file)) {

            while (scan.useDelimiter(p).hasNext()) {
                String word = scan.next().toLowerCase();
                if (!words.containsKey(word)) {
                    words.put(word, 1);
                } else {
                    int val = words.get(word);
                    words.replace(word, val, ++val);
                }

            }
            words.entrySet().forEach((e) -> {
                System.out.println(e.getKey() + " - " + e.getValue());
            });

        } catch (Exception e) {
            throw e;
        }
        return words.size();
    }

}
