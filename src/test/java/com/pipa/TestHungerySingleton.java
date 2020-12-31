package com.pipa;


import com.pipa.designpattern.HungerySingleton;

/**
 * purpose:
 * author: hwf
 * created: 2020/12/31
 */
public class TestHungerySingleton
{
    public static void main( String[] args )
    {
        HungerySingleton singleton1 = HungerySingleton.getInstance();
        HungerySingleton singleton2 = HungerySingleton.getInstance();
        System.out.println(singleton1);
        System.out.println(singleton2);
    }


}
