package com.pipa.designpattern.factory;

/**
 * @author peter
 * @date 2021/1/1
 */
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public AbstractCourse create() {
        return new JavaCourse();
    }
}
