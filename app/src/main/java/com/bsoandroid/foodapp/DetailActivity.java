package com.bsoandroid.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String judul = getIntent().getStringExtra("judul");

        Food food = getFood(judul);

        if (food != null) {

        }
    }

    public Food getFood(String judul) {
        ArrayList<Food> list = FoodData.getData();
        for (Food data : list) {
            if (data.judul.equals(judul)) {
                return data;
            }
        }
        return null;
    }
}