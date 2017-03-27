/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.java.course1.stack;

import java.util.ArrayList;

/**
 *
 * @author @param <T>
 */
public class CustomStack<T> implements Stack<T> {

    private int pos;
    private T[] arr;

    /**
     *
     * @param size
     */
    public CustomStack(int size) {
        arr = (T[]) new Object[size];
    }

    public CustomStack() {
        arr = (T[]) new Object[32];
    }

    public int getPos() {
        return pos;
    }

    public int length() {
        return arr.length;
    }

    public boolean isEmpty() {
        return pos == 0;
    }

    public void print() {
        for (int i = 0; i < getPos(); i++) {
            System.out.println(i + " => " + arr[i]);
        }
    }

    @Override
    public void push(T value) {
        if (arr.length == 0) {
            throw new RuntimeException("Стек пуст!");
        }
        if (pos > arr.length * 3 / 4) { // Stack is filled more than 75%
            resize(pos + pos / 2);
        }
        arr[pos] = value;
        pos++;
    }

    @Override
    public T pop() {
        if (pos == 0) {
            throw new RuntimeException("Стек не содержит элементов");
        }

        pos--;
        T t = arr[pos];
        arr[pos] = null;
        return t;
    }

    @Override
    public void trimToSize() {
        if (pos < arr.length) {
            resize(pos);
        }
    }

    private void resize(int newSize) {
        T[] newArr = (T[]) new Object[++newSize];
        System.arraycopy(arr, 0, newArr, 0, pos);
        arr = newArr;
    }

}
