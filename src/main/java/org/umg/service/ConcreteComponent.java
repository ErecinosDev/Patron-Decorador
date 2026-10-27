package org.umg.service;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@RequiredArgsConstructor
@ToString
public class ConcreteComponent implements IComponent {
    private final String name;

    @Override
    public String decorate() {
        return name;
    }
}
