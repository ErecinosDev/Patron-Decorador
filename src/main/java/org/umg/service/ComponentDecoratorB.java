package org.umg.service;

import lombok.ToString;


@ToString(callSuper = true)
public class ComponentDecoratorB extends ComponentDecorator {
    public ComponentDecoratorB(IComponent component) {
        super(component);
    }

    @Override
    public String decorate() {
        return super.decorate() + " + Decorador B";
    }

    public String customDecorateB() {
        return "Característica B aplicada";
    }
}
