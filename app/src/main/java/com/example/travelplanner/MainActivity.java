package com.example.travelplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SearchView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private SearchView search;
    private ImageButton btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        search = (SearchView) findViewById(R.id.search);
        search.setBackgroundResource(R.drawable.searchview_rounded);
        btn1 = (ImageButton) findViewById(R.id.seattle);
        SharedPreferences.Editor editor = getSharedPreferences("cityData", MODE_PRIVATE).edit();
        editor.putString("seattle", "In 1851, a group of immigrants from Illinois, led by one Arthur Denny, arrived at Alki Point on the eastern shores of the Puget Sound. The settlement they created was named Seattle in honor of a helpful local Indian leader Chief Sealth. ");
        editor.commit();
    }

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        return intent;
    }

    public void toCity1Activity(View v) {
        Intent intent = new Intent(this, City1Activity.class);
        startActivity(intent);
    }
}
