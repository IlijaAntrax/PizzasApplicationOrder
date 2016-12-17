package com.example.anton.pizzasapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;

import com.example.anton.pizzasapplication.data.TypeFood;
import com.example.anton.pizzasapplication.objectModels.ColumnImageAdapter;

public class MakeOrderActivity extends AppCompatActivity {

    private TypeFood m_TypeFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_order);

        m_TypeFood = (TypeFood) getIntent().getSerializableExtra("TYPE_FOOD");

        GridView gridView = (GridView) findViewById(R.id.gridView_foodSelect);
        gridView.setAdapter(new ColumnImageAdapter(this, null, m_TypeFood));
        setVisibilityViews();
    }
    public void setVisibilityViews() {
        switch (m_TypeFood) {
            case PIZZA:
                break;
            case SANDWICH:
                findViewById(R.id.imageButton_sizeFood_medium).setVisibility(View.INVISIBLE);
                findViewById(R.id.imageButton_sizeFood_extraLarge).setVisibility(View.INVISIBLE);
                findViewById(R.id.linearLayout_crustFood).setVisibility(View.INVISIBLE);
                break;
            case PANCAKE:
                findViewById(R.id.imageButton_sizeFood_medium).setVisibility(View.INVISIBLE);
                findViewById(R.id.imageButton_sizeFood_extraLarge).setVisibility(View.INVISIBLE);
                findViewById(R.id.linearLayout_crustFood).setVisibility(View.INVISIBLE);
                break;
            case SALAD:
                findViewById(R.id.linearLayout_sizeFood).setVisibility(View.INVISIBLE);
                findViewById(R.id.linearLayout_crustFood).setVisibility(View.INVISIBLE);
                break;
            case PASTA:
                findViewById(R.id.linearLayout_sizeFood).setVisibility(View.INVISIBLE);
                findViewById(R.id.linearLayout_crustFood).setVisibility(View.INVISIBLE);
                break;
            case DRINK:
                findViewById(R.id.linearLayout_sizeFood).setVisibility(View.INVISIBLE);
                findViewById(R.id.linearLayout_crustFood).setVisibility(View.INVISIBLE);
                break;
        }
    }
}
