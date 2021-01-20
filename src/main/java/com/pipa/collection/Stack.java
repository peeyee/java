package com.pipa.collection;

/**
 * purpose: interface for stack
 * author: peter
 * created: 2020/12/25
 */
public interface Stack<T> {
    /*
    * add a element to the top of stack
    *
    * */
     void push(T t);

     /*
     * remove a element from the top of stack
     *
     * */
     void pop(T t);

     boolean isFull();

     boolean isEmpty();
}
