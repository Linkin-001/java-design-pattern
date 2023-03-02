package com.learning.pattern.builder.builder;


import com.learning.pattern.builder.base.Packing;

public interface Item {

    public String name();

    public Packing packing();

    public float price();
}
