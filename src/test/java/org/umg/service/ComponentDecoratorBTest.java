package org.umg.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ComponentDecoratorBTest {

    @Test
    public void decorateAddsBehaviorBAfterPreviousDecorators() {
        ComponentDecoratorB decorator = new ComponentDecoratorB(
                new ComponentDecoratorA(new ConcreteComponent("Documento")));

        assertEquals("Documento + Decorador A + Decorador B", decorator.decorate());
    }

    @Test
    public void customDecorateBReturnsItsCustomBehavior() {
        ComponentDecoratorB decorator = new ComponentDecoratorB(new ConcreteComponent("Documento"));

        assertEquals("Característica B aplicada", decorator.customDecorateB());
    }

    @Test
    public void toStringIncludesTheDecoratedComponent() {
        ComponentDecoratorB decorator = new ComponentDecoratorB(new ConcreteComponent("Documento"));

        assertTrue(decorator.toString().contains("ComponentDecoratorB(super=ComponentDecorator(component="));
    }
}
