package com.pipa.testcollection;

import com.pipa.collection.ArrayList;
import com.pipa.collection.LinkedList;
import com.pipa.collection.List;

/**
 * purpose:
 * author: hwf
 * created: 2021/1/20
 */
public class TestListEfficiency<E> {

    private static final int[]  BATCH_SIZE = {1000,10000,100000,1000000,10000000};

    public static void testAdd(List<Integer> list)
    {

        for (int size : BATCH_SIZE) {

            System.out.println("Test Add");
            System.out.println("====== " + list.getClass().getName()+" ======");
            System.out.println("test size: " + size);
            Long startTime = System.currentTimeMillis();
            System.out.println("started at: "+ startTime);
            for (int i = 0; i < size; i++) {
                list.add(Integer.valueOf(i));
            }
            Long endTime = System.currentTimeMillis();
            System.out.println("finished at: "+ endTime);
            Long consume = endTime - startTime;
            System.out.println("consume " + consume + " milliseconds");
            System.out.println();

        }

    }


    public static void testGet(List<Integer> list)
    {

        for (int size : BATCH_SIZE) {
            for (int i = 0; i < size; i++) {
                list.add(Integer.valueOf(i));
            }
            System.out.println("Test Get");
            System.out.println("====== " + list.getClass().getName()+" ======");
            System.out.println("test size: " + size);
            Long startTime = System.currentTimeMillis();
            System.out.println("started at: "+ startTime);
            list.get(size / 2);
            Long endTime = System.currentTimeMillis();
            System.out.println("finished at: "+ endTime);
            Long consume = endTime - startTime;
            System.out.println("consume " + consume + " milliseconds");
            System.out.println();

        }

    }
}
