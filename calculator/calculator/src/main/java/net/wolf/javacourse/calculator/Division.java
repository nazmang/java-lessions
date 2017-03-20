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
public class Division implements BinaryOperation{

    @Override
    public double resultFor(double left, double right) throws ArithmeticException{
        if (Double.isInfinite(right) || Double.isNaN(right)){
            throw new ArithmeticException("Division by zero!" + right); 
        }
        else{
            return left / right;
        }
        
    }
    
}
