package com.pipa.collection;

/**
 * purpose:
 * author: hwf
 * created: 2020/12/25
 */
public class LinkStack<T> extends AbstractStack<T> {

    @Override
    public void push(Object o) {

    }

    @Override
    public void pop(Object o) {

    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}

class Node<T>
{
    Node<T> next;
}