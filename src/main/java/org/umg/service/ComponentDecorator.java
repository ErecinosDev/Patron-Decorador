package org.umg.service;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;


@Getter
@RequiredArgsConstructor
@ToString
public abstract class ComponentDecorator implements IComponent {
    protected final IComponent component;

    @Override
    public String decorate() {
        return component.decorate();
    }
}
