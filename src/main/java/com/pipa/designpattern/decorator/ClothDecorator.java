package com.pipa.designpattern.decorator;

/**
 * @author peter
 * @date 2021/1/3
 */
public class ClothDecorator extends Decorator {
    @Override
    public void show() {
        super.show();
        System.out.printf("穿一件衣服。");
    }
}
