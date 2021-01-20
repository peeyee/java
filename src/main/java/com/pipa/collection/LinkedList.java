package com.pipa.collection;

/**
 * double linked list.
 * purpose:
 * author: hwf
 * created: 2021/1/20
 */
public class LinkedList<E> implements List<E> {

    private Node<E> head;
    private Node<E> tail;

    /**
     * the current used space;
     */
    private int size;

    public LinkedList()
    {
        head = new Node<>();
        tail = head;
    }

    @Override
    public E get(int i) {
        if(!isValidIndex(i))
        {
            throw new IndexOutOfBoundsException();
        }
        return node(i).element;
    }

    @Override
    public void add(E e) {
        if (size == 0) {
            head.element = e;
        }else {
            tail.next = new Node<E>();
            tail.next.pre = tail;
            tail = tail.next;
            tail.element = e;
        }
        size++;
    }

    @Override
    public void set(int i, E e) {
        if(!isValidIndex(i))
        {
            throw new IndexOutOfBoundsException();
        }
        node(i).element = e;
    }

    @Override
    public Iterator<E> iter() {
        return new Iterator<E>() {
            Node<E> ptr = head;
            int i = 0;
            @Override
            public boolean hasNext() {
                return i <= size - 1;
            }

            @Override
            public E next() {
                E e = ptr.element;
                ptr = ptr.next;
                i++;
                return e;
            }
        };
    }

    private class Node<E> {
        E element;
        Node<E> next;
        Node<E> pre;
    }

    private Node<E> node(int i){
        if(i < (size >> 1))
        {
            int pos = 0;
            Node<E> e = head;
            while ( pos < i)
            {
                e = e.next;
                pos++;
            }
            return e;
        }else {
            int pos = size - 1;
            Node<E> e = tail;
            while ( pos > i)
            {
                e = e.pre;
                pos--;
            }
            return e;
        }
    }

    private boolean isValidIndex(int i)
    {
        return i >=0 && i < size;
    }
}
