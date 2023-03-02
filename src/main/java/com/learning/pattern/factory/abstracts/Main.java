package com.learning.pattern.factory.abstracts;

import com.learning.pattern.factory.abstracts.color.Color;
import com.learning.pattern.factory.abstracts.enums.ColorEnums;
import com.learning.pattern.factory.abstracts.enums.FactoryEnums;
import com.learning.pattern.factory.abstracts.enums.ShapeEnums;
import com.learning.pattern.factory.abstracts.factory.AbstractFactory;
import com.learning.pattern.factory.abstracts.factory.FactoryProducer;
import com.learning.pattern.factory.abstracts.shape.Shape;

public class Main {
    /**
     * 这玩意扩展起来太麻烦了
     * 1. 如果有抽象工厂有一个新产品，那么需要针对抽象工厂做横向扩展：在producer上增加获取新产品入口，然后增加新产品的工厂类
     * 2. 工厂类继承抽象工厂需要实现别个工厂的方法，增加、修改的成本较高
     *
     * @param args args
     */
    public static void main(String[] args) {
        AbstractFactory factory = FactoryProducer.getFactory(FactoryEnums.SHAPE);
        Shape circle = factory.getShape(ShapeEnums.CIRCLE);
        circle.draw();

        Shape rectangle = factory.getShape(ShapeEnums.RECTANGLE);
        rectangle.draw();

        Shape square = factory.getShape(ShapeEnums.SQUARE);
        square.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryEnums.COLOR);
        Color red = colorFactory.getColor(ColorEnums.RED);
        red.fill();

        Color green = colorFactory.getColor(ColorEnums.GREEN);
        green.fill();

        Color blue = colorFactory.getColor(ColorEnums.BLUE);
        blue.fill();
    }
}
