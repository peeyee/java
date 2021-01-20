package com.pipa;

import com.pipa.designpattern.decorator.BaseComponent;
import com.pipa.designpattern.decorator.ClothDecorator;
import com.pipa.designpattern.decorator.IComponent;
import com.pipa.designpattern.decorator.TrousersDecorator;

/**
 * @author peter
 * @date 2021/1/3
 */
public class TestDecorator {
    public static void main(String[] args) {
        IComponent person = new BaseComponent();
        ClothDecorator clothDecorator = new ClothDecorator();
        clothDecorator.setComponent(person);
        TrousersDecorator trousersDecorator = new TrousersDecorator();
        trousersDecorator.setComponent(clothDecorator);
        trousersDecorator.show();
    }

}
