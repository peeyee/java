package com.pipa.testcollection;

import com.pipa.collection.ArrayList;
import com.pipa.collection.Iterator;
import com.pipa.collection.LinkedList;
import com.pipa.collection.List;
import org.junit.Before;
import org.junit.Test;

/**
 * purpose:
 * author: hwf
 * created: 2021/1/19
 */
public class TestLinkedList {

    private List<Integer> list;

    @Before
    public void init(){
        list = new LinkedList<>();
        for (int i = 0; i < 100; i++){
            list.add(i);
        }
    }

    @Test
    public void testSet()
    {
        list.set(0,Integer.valueOf(100));
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
        list.add(1000);
        System.out.println(list.get(0));
        System.out.println(list.get(99));
        System.out.println(list.get(100));
    }

    @Test
    public void testIterator()
    {
        Iterator<Integer> iter = list.iter();
        while (iter.hasNext())
        {
            System.out.println(iter.next());
        }
    }

    @Test
    public void testEfficiency()
    {
        // my list
        List<Integer> list = new LinkedList<>();
        TestListEfficiency.testGet(list);

        List<Integer> list2 = new ArrayList<>();
        TestListEfficiency.testGet(list2);
    }
}
