package org.umg.service;

import lombok.ToString;

@ToString(callSuper = true)
public class ComponentDecoratorA extends ComponentDecorator {
    public ComponentDecoratorA(IComponent component) {
        super(component);
    }

    @Override
    public String decorate() {
        return super.decorate() + " + Decorador A";
    }

    public String customDecorateA() {
        return "Característica A aplicada";
    }
}
