package com.pipa;

import com.pipa.designpattern.singleton.LazySingleton;

/**
 * purpose:
 * author: hwf
 * created: 2020/12/31
 */
public class LazySingletonThread implements Runnable {
    @Override
    public void run() {
        LazySingleton singleton = LazySingleton.getInstanceConcurrent();
        System.out.println(singleton);
    }
}
