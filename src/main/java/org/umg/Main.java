package org.umg;

import org.umg.service.ComponentDecoratorA;
import org.umg.service.ComponentDecoratorB;
import org.umg.service.ConcreteComponent;
import org.umg.service.IComponent;

public class Main {
    public static void main(String[] args) {
        IComponent componente = new ConcreteComponent("Documento");
        IComponent decorado = new ComponentDecoratorB(new ComponentDecoratorA(componente));
        System.out.println(decorado.decorate());
    }
}
