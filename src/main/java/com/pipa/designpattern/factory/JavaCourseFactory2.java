package com.pipa.designpattern.factory;

/**
 * @author peter
 * @date 2021/1/1
 */
public class JavaCourseFactory2 extends AbstractFactory {
    @Override
    public IVideo createVideo() {
        System.out.println("create java video.");
        return new JavaVideo();
    }

    @Override
    public INote createNote() {
        System.out.println("create java note.");
        return new JavaNote();
    }
}
