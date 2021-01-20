package com.pipa;

import com.pipa.designpattern.factory.SimpleFactory;

/**
 * @author peter
 * @date 2021/1/1
 */
public class TestSimpleFactory {
    public static void main(String[] args) {
        SimpleFactory.createClass("java");
        SimpleFactory.createClass("python");
    }
}
