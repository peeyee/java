package com.pipa;

import com.pipa.designpattern.factory.AbstractFactory;
import com.pipa.designpattern.factory.JavaCourseFactory2;

/**
 * @author peter
 * @date 2021/1/1
 */
public class TestAbstractFactory {
    public static void main(String[] args) {
        AbstractFactory iCourseFactory = new JavaCourseFactory2();
        iCourseFactory.createVideo();
        iCourseFactory.createNote();
    }
}
