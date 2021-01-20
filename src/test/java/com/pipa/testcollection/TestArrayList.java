package com.pipa.testcollection;

import com.pipa.collection.ArrayList;
import com.pipa.collection.Iterator;
import com.pipa.collection.List;
import org.junit.Before;
import org.junit.Test;

/**
 * purpose:
 * author: hwf
 * created: 2021/1/19
 */
public class TestArrayList {

    private List<Integer> list;

    @Before
    public void init(){
         list = new ArrayList<Integer>(10);
    }

    @Test
    public void testSet()
    {
        list.set(1,Integer.valueOf(100));
    }

    @Test
    public void testGet()
    {
//        list.get(-1);
        System.out.println(list.get(0));
        System.out.println(list.get(01));
        System.out.println(list.get(11));
    }

    @Test
    public void testAdd()
    {
//        list.get(-1);
        list.add(1);
        System.out.println(list.get(01));

        for (int i = 0; i < 100; i++){
            list.add(i);
        }

    }

    @Test
    public void testIterator()
    {
        for (int i = 0; i < 100; i++){
            list.add(i);
        }

        Iterator<Integer> iter = list.iter();
        while (iter.hasNext())
        {
            System.out.println(iter.next());
        }
    }

    @Test
    public void testEfficiency()
    {
        List<Integer> list = new ArrayList<>(1000);
        TestListEfficiency.testAdd(list);
    }
}
