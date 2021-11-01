package com.bsoandroid.foodapp;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;

public class FoodData {
    public static ArrayList<Food> getData(Context context) {
        ArrayList<Food> list = new ArrayList<Food>();
        list.add(new Food("Batagor", "Makananan batagor", 5000, context.getDrawable(R.drawable.batagor)));
        list.add(new Food("Black Salad", "Makananan Salad", 5000, context.getDrawable(R.drawable.black_salad)));
        list.add(new Food("Caphuchino", "Makananan Capuhcino", 5000, context.getDrawable(R.drawable.cappuchino)));
        list.add(new Food("Cheesecake", "Makananan Cheesecake", 5000, context.getDrawable(R.drawable.cheesecake)));
        return list;
    }
}
