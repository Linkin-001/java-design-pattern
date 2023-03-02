package com.learning.pattern.factory.abstracts.factory;

import com.learning.pattern.factory.abstracts.color.Color;
import com.learning.pattern.factory.abstracts.enums.ColorEnums;
import com.learning.pattern.factory.abstracts.enums.ShapeEnums;
import com.learning.pattern.factory.abstracts.shape.Circle;
import com.learning.pattern.factory.abstracts.shape.Rectangle;
import com.learning.pattern.factory.abstracts.shape.Shape;
import com.learning.pattern.factory.abstracts.shape.Square;

import java.security.InvalidParameterException;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(ColorEnums color) {
        return null;
    }

    @Override
    public Shape getShape(ShapeEnums shape) {
        switch (shape) {
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                return new Rectangle();
            case SQUARE:
                return new Square();
            default:
                throw new InvalidParameterException("Shape doesn't exist");
        }
    }
}
