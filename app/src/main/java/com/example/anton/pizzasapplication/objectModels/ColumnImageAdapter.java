package com.example.anton.pizzasapplication.objectModels;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.anton.pizzasapplication.R;
import com.example.anton.pizzasapplication.data.TypeFood;

/**
 * Created by anton on 12/17/2016.
 */

public class ColumnImageAdapter extends BaseAdapter{

    private Context m_Context;
    private TypeFood m_Type;
    private Integer[] m_FoodIds = {
            R.drawable.common_google_signin_btn_icon_dark,
            R.drawable.common_google_signin_btn_icon_dark_focused,
            R.drawable.common_google_signin_btn_icon_dark_normal,
            R.drawable.common_google_signin_btn_icon_light_pressed,
            R.drawable.common_plus_signin_btn_icon_dark_disabled,
            R.drawable.common_google_signin_btn_icon_light_normal,
            R.drawable.common_google_signin_btn_icon_light
    };

    public ColumnImageAdapter(Context aContext, Integer[]aFood, TypeFood aType) {
        m_Context = aContext;
        m_Type = aType;
        //m_FoodIds = aFood;
        //setImagesResources();
    }

    @Override
    public int getCount() {
        return m_FoodIds.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView;
        if (view == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(m_Context);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) view;
        }

        imageView.setImageResource(m_FoodIds[i]);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //add body of function
            }
        });
        return imageView;
    }

    public void setImagesResources() {
        switch (m_Type) {
            case PIZZA:
                break;
            case SANDWICH:
                break;
            case PANCAKE:
                break;
            case SALAD:
                break;
            case TOPPING:
                break;
            case DRINK:
                break;
        }
    }

}
