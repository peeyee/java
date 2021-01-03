package com.pipa.designpattern.decorator;

/**
 * @author peter
 * @date 2021/1/3
 */
public class TrousersDecorator extends Decorator {
    @Override
    public void show() {
        super.show();
        System.out.printf("穿了一条裤子。");
    }
}
