package com.pipa;


/**
 * purpose:
 * author: hwf
 * created: 2020/12/31
 */
public class TestLazySingleton
{
    public static void main( String[] args )
    {
        Thread t1 = new Thread(new LazySingletonThread());
        Thread t2 = new Thread(new LazySingletonThread());
        t1.start();
        t2.start();
    }


}
