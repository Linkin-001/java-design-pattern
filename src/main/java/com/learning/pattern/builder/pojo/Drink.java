package com.learning.pattern.builder.pojo;


import com.learning.pattern.builder.base.Bottle;
import com.learning.pattern.builder.base.Packing;
import com.learning.pattern.builder.builder.Item;

public abstract class Drink implements Item {
    //分冷饮和热饮


    @Override
    public String name() {
        return "Drink";
    }

    @Override
    public Packing packing() {
        return new Bottle();
    }

}
