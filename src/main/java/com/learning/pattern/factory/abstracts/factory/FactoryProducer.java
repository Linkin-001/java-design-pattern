package com.learning.pattern.factory.abstracts.factory;

import com.learning.pattern.factory.abstracts.enums.FactoryEnums;

import java.security.InvalidParameterException;

public class FactoryProducer {

    public static AbstractFactory getFactory(FactoryEnums factory) {
        switch (factory) {
            case SHAPE:
                return new ShapeFactory();
            case COLOR:
                return new ColorFactory();
            default:
                throw new InvalidParameterException("Factory doesn't exist");
        }
    }
}
