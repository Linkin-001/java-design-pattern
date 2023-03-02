package com.learning.pattern.factory.abstracts.factory;

import com.learning.pattern.factory.abstracts.color.Color;
import com.learning.pattern.factory.abstracts.enums.ColorEnums;
import com.learning.pattern.factory.abstracts.enums.ShapeEnums;
import com.learning.pattern.factory.abstracts.shape.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(ShapeEnums shape);

    public abstract Color getColor(ColorEnums color);
}
