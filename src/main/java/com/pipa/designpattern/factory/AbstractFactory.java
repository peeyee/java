package com.pipa.designpattern.factory;

/**
 * @author peter
 * @date 2021/1/1
 */
public abstract class AbstractFactory {
    abstract public IVideo createVideo();
    abstract public INote createNote();
}
