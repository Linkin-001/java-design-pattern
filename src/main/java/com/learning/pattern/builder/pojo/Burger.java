package com.learning.pattern.builder.pojo;

import com.learning.pattern.builder.base.Packing;
import com.learning.pattern.builder.base.Wrapper;
import com.learning.pattern.builder.builder.Item;

public abstract class Burger implements Item {
    @Override
    public String name() {
        return "Burger";
    }

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    /**
     * 这里抽象类可以不用实现interface的方法
     *
     * @return price
     */
    @Override
    public abstract float price();
}
