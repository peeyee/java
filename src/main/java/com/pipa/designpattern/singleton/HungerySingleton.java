package com.pipa.designpattern.singleton;

/**
 * purpose:
 * author: hwf
 * created: 2020/12/31
 */
public class HungerySingleton {

    private static HungerySingleton instance = new HungerySingleton();
    private HungerySingleton(){};

    public static HungerySingleton getInstance() {
        return instance;
    }
}
