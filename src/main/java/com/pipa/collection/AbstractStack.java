package com.pipa.collection;

/**
 * purpose:
 * author: hwf
 * created: 2020/12/25
 */
public abstract class AbstractStack<T> implements IStack {

    @Override
    public abstract void push(Object o);

    @Override
    public abstract void pop(Object o);

    @Override
    public abstract boolean isFull();

    @Override
    public boolean isEmpty(){
        return size() == 0;
    };

    public abstract int size();
}
