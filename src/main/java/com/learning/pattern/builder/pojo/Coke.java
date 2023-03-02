package com.learning.pattern.builder.pojo;

public class Coke extends Drink{
    @Override
    public float price() {
        return 0;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
