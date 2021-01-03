package com.pipa.designpattern.decorator;

/**
 * @author peter
 * @date 2021/1/3
 */
public class BaseComponent implements IComponent {
    @Override
    public void show() {
        System.out.println("这是小明。");
    }
}
