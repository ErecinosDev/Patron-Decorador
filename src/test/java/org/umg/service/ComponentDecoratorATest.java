package org.umg.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ComponentDecoratorATest {

    @Test
    public void decorateAddsBehaviorA() {
        ComponentDecoratorA decorator = new ComponentDecoratorA(new ConcreteComponent("Documento"));

        assertEquals("Documento + Decorador A", decorator.decorate());
    }

    @Test
    public void customDecorateAReturnsItsCustomBehavior() {
        ComponentDecoratorA decorator = new ComponentDecoratorA(new ConcreteComponent("Documento"));

        assertEquals("Característica A aplicada", decorator.customDecorateA());
    }

    @Test
    public void toStringIncludesTheDecoratedComponent() {
        ComponentDecoratorA decorator = new ComponentDecoratorA(new ConcreteComponent("Documento"));

        assertTrue(decorator.toString().contains("ComponentDecoratorA(super=ComponentDecorator(component="));
    }
}
