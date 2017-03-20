/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.calculator;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrey
 */
public class Calculator {
    
    
    public double calculate(String val1, String val2, String operator) throws Exception {
        BinaryOperation operation = getOperationFor(operator);
        double left = Double.parseDouble(val1);
        double right = Double.parseDouble(val2);
        return operation.resultFor(left, right);        
    }
            
    private BinaryOperation getOperationFor(String operator) throws Exception{
        if ("*".equals(operator)) {
            return new Multiplication();
        } 
        else if ("-".equals(operator)) {
            return new Substraction();
        }
        else if ("+".equals(operator)) {
            return new Addition();
        }
        else if ("/".equals(operator)) {
            return new Division();
        }
        else if ("root".equals(operator)) {
            return new Root();
        }
        else if ("pow".equals(operator)) {
            return new Power();
        }
        else if ("log".equals(operator)) {
            return new Logarithm();
        }
        throw new IncorrectOperatorException("Неизвестный оператор " + operator);   
    }
    
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        String left, right, operator;
        boolean isExit = false;
        
        while(!isExit){
            System.out.println("Введите 1-ый операнд или exit для выхода: ");
            left = reader.next();
            if(left.equals("exit")){
                isExit = true;
                break;
            }
            System.out.println("Введите 2-oй операнд: ");
            right = reader.next();
            System.out.println("Введите операнд (/,+,-,*,pow,root,log): ");
            operator = reader.next();
            try{
                System.out.println("Результат: " + calculator.calculate(left, right, operator));
            }
            catch(NumberFormatException nfex){
                System.out.println("Неверный операнд " + nfex.toString());
            } 
            catch (Exception ex) {
                System.out.println(Calculator.class.getName() + ex.toString());
            }
        }
        
        
    }

    private static class IncorrectOperatorException extends Exception {

        public IncorrectOperatorException(String string) {
            super(string);
        }
    }
}
