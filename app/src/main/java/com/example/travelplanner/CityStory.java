package com.example.travelplanner;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CityStory extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.city_story);
        final TextView tvCityHistory = (TextView) findViewById(R.id.cityHistory);
        SharedPreferences pref = getSharedPreferences("cityData", MODE_PRIVATE);
        String name = pref.getString("seattle", "");
        Log.i("MainActivity", "name is " + name);
        tvCityHistory.setText(name);

    }
}
