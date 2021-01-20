package com.pipa.collection;

/**
 * purpose:
 * author: peter
 * created: 2021/1/19
 */
public interface Iterator<E> {
    boolean hasNext();
    E next();
}
