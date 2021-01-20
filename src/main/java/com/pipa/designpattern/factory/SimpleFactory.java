package com.pipa.designpattern.factory;


/**
 * @author peter
 * @date 2021/1/1
 */
public class SimpleFactory {
    private AbstractCourse aClass;
    public static AbstractCourse createClass(String classType)
    {
        switch (classType)
        {
            case "java":
                return new JavaCourse();
            case "python":
                return new PythonCourse();
        }
        return null;
    }
}
