package com.pipa.designpattern.decorator;

/**
 * @author peter
 * @date 2021/1/3
 */
public abstract class Decorator implements IComponent{

    private IComponent component;

    public void setComponent(IComponent component) {
        this.component = component;
    }

    public void show(){
        if( component != null){
            component.show();
        }
    };
}
