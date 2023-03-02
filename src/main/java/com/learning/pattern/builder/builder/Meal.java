package com.learning.pattern.builder.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    /**
     * Burger和Drink都implement了Item，所以Item里面可以放Burger+Drink => 这样就生成了一个套餐
     * <b>这就是为什么，这个模式实体类型会需要具有相似性</b>
     */
    private final List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        double sum = items.stream().mapToDouble(Item::price).sum();
        return (float) sum;
    }

    public void showItems() {
        items.forEach(item -> {
            System.out.print("Item: " + item.name());
            System.out.print(", \t packing: " + item.packing().pack());
            System.out.println(", \t price: " + item.price());
        });
    }
}
