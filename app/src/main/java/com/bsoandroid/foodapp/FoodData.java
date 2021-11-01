package com.bsoandroid.foodapp;

import java.util.ArrayList;

public class FoodData {
    public static ArrayList<Food> getData() {
        ArrayList<Food> list = new ArrayList<Food>();
        list.add(new Food("Batagor", "Makananan batagor", 5000));
        list.add(new Food("Black Salad", "Makananan Salad", 5000));
        list.add(new Food("Caphuchino", "Makananan Capuhcino", 5000));
        list.add(new Food("Cheesecake", "Makananan Cheesecake", 5000));
        return list;
    }
}
