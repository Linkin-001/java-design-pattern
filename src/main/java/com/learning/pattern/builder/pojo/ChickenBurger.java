package com.learning.pattern.builder.pojo;

import java.io.Serializable;

public class ChickenBurger extends Burger implements Serializable {
    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }

}
