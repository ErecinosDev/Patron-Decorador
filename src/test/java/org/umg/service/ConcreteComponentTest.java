package org.umg.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConcreteComponentTest {

    @Test
    public void decorateReturnsTheComponentName() {
        ConcreteComponent component = new ConcreteComponent("Documento");

        assertEquals("Documento", component.decorate());
    }

    @Test
    public void toStringContainsTheComponentName() {
        ConcreteComponent component = new ConcreteComponent("Documento");

        assertEquals("ConcreteComponent(name=Documento)", component.toString());
    }
}
