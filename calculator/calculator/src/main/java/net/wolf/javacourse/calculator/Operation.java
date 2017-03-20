/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.calculator;

/**
 *
 * @author nazman
 */
public class Operation {

    public Operation() {
        
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
        throw new Operation.IncorrectOperatorException("Неизвестный оператор " + operator);   
    }
    
     private static class IncorrectOperatorException extends Exception {

        public IncorrectOperatorException(String string) {
            super(string);
        }
    }
}
