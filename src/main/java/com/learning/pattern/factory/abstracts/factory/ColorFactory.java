package com.learning.pattern.factory.abstracts.factory;

import com.learning.pattern.factory.abstracts.color.Blue;
import com.learning.pattern.factory.abstracts.color.Color;
import com.learning.pattern.factory.abstracts.color.Green;
import com.learning.pattern.factory.abstracts.color.Red;
import com.learning.pattern.factory.abstracts.enums.ColorEnums;
import com.learning.pattern.factory.abstracts.enums.ShapeEnums;
import com.learning.pattern.factory.abstracts.shape.Shape;

import java.security.InvalidParameterException;

public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(ShapeEnums shape) {
        return null;
    }

    @Override
    public Color getColor(ColorEnums color) {
        switch (color) {
            case RED:
                return new Red();
            case BLUE:
                return new Blue();
            case GREEN:
                return new Green();
            default:
                throw new InvalidParameterException("Color doesn't exist");
        }
    }
}
