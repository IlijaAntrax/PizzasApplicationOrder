package com.example.anton.pizzasapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.anton.pizzasapplication.objectModels.RowChangeToppingAdapter;

public class ChangeToppingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_toppings);

        //set listViews for every kind of topping (changeable!)
        //ListView listView = (ListView) findViewById(R.id.listView_toppingsCheese);
        //listView.setAdapter(new RowChangeToppingAdapter(this));
    }
}
