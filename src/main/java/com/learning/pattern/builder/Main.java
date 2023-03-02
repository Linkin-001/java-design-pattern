package com.learning.pattern.builder;


import com.learning.pattern.builder.builder.Meal;
import com.learning.pattern.builder.builder.MealBuilder;

public class Main {

    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();
        Meal vegMeal = builder.perpareVegMeal();
        Meal nonVegMeal = builder.prepareNonVegMeal();

        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total cost: " + vegMeal.getCost());

        System.out.println();

        System.out.println("Non Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total cost: " + nonVegMeal.getCost());
    }

    public void test(){
        // 看看StringBuilder是怎么一回事
        StringBuilder sb = new StringBuilder();

    }
}
