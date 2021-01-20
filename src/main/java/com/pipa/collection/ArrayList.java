package com.pipa.collection;



/**
 * <P>make collection more simple and effective.
 * with narrow apis.
 * </P>
 * <P>not thread safe</P>
 * purpose:
 * author: hwf
 * created: 2021/1/19
 */
public class ArrayList<E> implements List<E> {

    private transient Object[] elements;

    private int capacity;

    /**
     * the current used space;
     */
    private int size;

    /**
     * default size of array
     */
    private static final int DEFAULT_SIZE = 10;

    public ArrayList()
    {
        capacity = DEFAULT_SIZE;
        elements =  new Object[DEFAULT_SIZE];
    }

    public ArrayList(int initial_size){
        capacity = initial_size;
        elements =  new Object[initial_size];
    }

    @Override
    public E get(int i) throws ArrayIndexOutOfBoundsException{
        return (E) elements[i];
    }

    @Override
    public void add(E e) {
        checkCapacity();
        elements[size++] = e;
    }




    @Override
    public void set(int i, E e) {
        elements[i] =  e;
    }

    @Override
    public Iterator<E> iter() {
        return new Iterator<E>() {
            private int i;
            @Override
            public boolean hasNext() {
                return i <= size - 1;
            }

            @Override
            public E next() {
                return (E) elements[i++];
            }
        };
    }

    private void checkCapacity() {
        if(size == capacity){
            resize();
        }
    }

    private void resize() {
        capacity = (capacity >> 1) + capacity;
        Object[] newElements = new Object[capacity];
        System.arraycopy(elements,0,newElements,0,elements.length);
        elements = newElements;
    }


}
