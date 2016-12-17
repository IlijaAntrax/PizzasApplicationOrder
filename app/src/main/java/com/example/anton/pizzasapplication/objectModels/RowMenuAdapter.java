package com.example.anton.pizzasapplication.objectModels;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.anton.pizzasapplication.MakeOrderActivity;
import com.example.anton.pizzasapplication.R;
import com.example.anton.pizzasapplication.data.FoodItem;
import com.example.anton.pizzasapplication.data.Pancake;
import com.example.anton.pizzasapplication.data.Pasta;
import com.example.anton.pizzasapplication.data.Pizza;
import com.example.anton.pizzasapplication.data.Salad;
import com.example.anton.pizzasapplication.data.Sandwich;
import com.example.anton.pizzasapplication.data.TypeFood;
import com.example.anton.pizzasapplication.fragments.MakeOrderFragment;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by anton on 12/13/2016.
 */

public class RowMenuAdapter extends BaseAdapter {

    private ArrayList<RowData> m_rowListMenu;
    private LayoutInflater m_layoutInflater;
    private Activity m_Activity;

    public RowMenuAdapter(Activity aActivity, Context aContext, ArrayList<RowData> aListData) {
        this.m_rowListMenu = aListData;
        m_layoutInflater = LayoutInflater.from(aContext);
        m_Activity = aActivity;
    }

    @Override
    public int getCount() {
        return  m_rowListMenu.size();
    }

    @Override
    public Object getItem(int i) {
        return m_rowListMenu.get(i);
    }

    @Override
    public long getItemId(int i) {
        return  i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final ViewHolder holder;
        if (view == null) {
            view = m_layoutInflater.inflate(R.layout.listview_rowmenu, null);
            holder = new ViewHolder();
            holder.imageView = (ImageView) view.findViewById(R.id.imageView_rowImage);
            holder.textView = (TextView) view.findViewById(R.id.textView_rowText);
            holder.imageButton = (ImageButton) view.findViewById(R.id.imageButton_rowButton);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        holder.imageView.setImageResource(m_rowListMenu.get(i).getImage());
        holder.textView.setText(m_rowListMenu.get(i).getText());
        holder.imageButton.setImageResource(m_rowListMenu.get(i).getButton());

        holder.imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(m_layoutInflater.getContext(), "Selected: " + holder.textView.getText(), Toast.LENGTH_SHORT).show();
                showOrderActivity(holder.textView.getText().toString());
            }
        });

        return view;
    }
    static class ViewHolder {
        ImageView imageView;
        TextView textView;
        ImageButton imageButton;
    }

    public void showOrderActivity(String order) {
        FoodItem orderObject = null;
        TypeFood typeFood = null;
        switch (order) {
            case "PIZZA":
                orderObject = new Pizza();
                typeFood = TypeFood.PIZZA; break;
            case "SANDWICH":
                orderObject = new Sandwich();
                typeFood = TypeFood.SANDWICH; break;
            case "PANCAKE":
                orderObject  = new Pancake();
                typeFood = TypeFood.PANCAKE; break;
            case "PASTA":
                orderObject  = new Pasta();
                typeFood = TypeFood.PASTA; break;
            case "SALAD":
                orderObject  = new Salad();
                typeFood = TypeFood.SALAD; break;
        }
        showActivity(orderObject,typeFood);
    }
    public void showActivity(FoodItem aOrder, TypeFood aTypeFood) {

        Intent intent = new Intent(m_Activity, MakeOrderActivity.class);
        intent.putExtra("TYPE_FOOD", aTypeFood);
        m_Activity.startActivity(intent);

        //MakeOrderFragment makeOrderFragment = new MakeOrderFragment(order);
        //FragmentTransaction fragmentTransaction = m_Activity.getFragmentManager().beginTransaction();
        //fragmentTransaction.replace(R.id.fragment_menu_context,makeOrderFragment);
        //fragmentTransaction.commit();
    }
}
