package com.bsoandroid.foodapp;

import java.util.ArrayList;

public class FoodData {
    public static ArrayList<Food> data = new ArrayList<Food>();

    FoodData() {
        data.add(new Food("Batagor", "Makananan batagor", 5000));
        data.add(new Food("Black Salad", "Makananan Salad", 5000));
        data.add(new Food("Caphuchino", "Makananan Capuhcino", 5000));
        data.add(new Food("Cheesecake", "Makananan Cheesecake", 5000));
    }
}
