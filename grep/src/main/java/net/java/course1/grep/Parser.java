/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.java.course1.grep;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 *
 * @author nazman
 */
public class Parser {

    public static void main(String[] args) {
        if(args.length < 2)
            System.out.println("Недостаточно аргументов.");
        else
        try {
            
            //String word = "язык[ао]";
            String word = args[1];
            Path file = Paths.get(args[0]);
            Pattern p = Pattern.compile(".*" + word + ".*", Pattern.CASE_INSENSITIVE);  
            int lines = 0;
            
            try {
                
                BufferedReader a = Files.newBufferedReader(file);
                
                StringBuilder sb = new StringBuilder();
                String line = a.readLine();
                
                while (line != null) {
                     ++lines;
                    if(p.matcher(line).matches()){
                       
                        sb.append(lines).append(":").append(line).append(System.lineSeparator());
                                            
                    }                    
                    line = a.readLine();
                }
                System.out.println(sb.toString());
            } catch (IOException x) {
                // Какая то проблема
                System.err.println(x);
            }

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    
}
