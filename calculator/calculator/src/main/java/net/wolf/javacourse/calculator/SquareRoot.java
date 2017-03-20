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
public class SquareRoot implements UnaryOperation {

    @Override
    public double resultFor(double left) throws ArithmeticException{
        if (Double.isInfinite(left) || Double.isNaN(left)){
            throw new ArithmeticException("Division by zero!"); 
        }
        else{
           return Math.sqrt(left);
        }
    }
    
}
