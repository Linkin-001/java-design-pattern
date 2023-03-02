package com.learning.pattern.builder.builder;


import com.learning.pattern.builder.pojo.ChickenBurger;
import com.learning.pattern.builder.pojo.Coke;
import com.learning.pattern.builder.pojo.Fanta;
import com.learning.pattern.builder.pojo.VegBurger;

/**
 * 生成套餐
 */
public class MealBuilder {

    public Meal perpareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new ChickenBurger());
        meal.addItem(new Fanta());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Fanta());
        meal.addItem(new Coke());
        return meal;
    }
}
