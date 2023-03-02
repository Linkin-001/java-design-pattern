package com.learning.pattern.builder.pojo;

public class Fanta extends Drink{

    // 包装行为都在Drink中定义了，所以具体的类里面不需要再进行定义了
    @Override
    public float price() {
        return 2.5f;
    }

    @Override
    public String name() {
        return "Fanta sea";
    }
}
