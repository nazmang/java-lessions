/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.java.course1.stack;

/**
 *
 * @author 
 * @param <T>
 */
public interface Stack<T> {

    /**
     *
     * @param value
     */
    void push(T value);

    /**
     *
     * @return
     */
    T pop();

    /**
     *
     */
    void trimToSize();

}
