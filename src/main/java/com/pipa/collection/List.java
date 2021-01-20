package com.pipa.collection;

/**
 * purpose:
 * author: peter
 * created: 2021/1/19
 */
public interface List<E> {
    E get(int i);
    void add(E e);
    void set(int i,E e);
    Iterator<E> iter();
}
