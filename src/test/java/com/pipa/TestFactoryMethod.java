package com.pipa;

import com.pipa.designpattern.factory.ICourseFactory;
import com.pipa.designpattern.factory.JavaCourseFactory;
import com.pipa.designpattern.factory.SimpleFactory;

/**
 * @author peter
 * @date 2021/1/1
 */
public class TestFactoryMethod {
    public static void main(String[] args) {
        ICourseFactory iCourseFactory = new JavaCourseFactory();
        iCourseFactory.create();
    }
}
