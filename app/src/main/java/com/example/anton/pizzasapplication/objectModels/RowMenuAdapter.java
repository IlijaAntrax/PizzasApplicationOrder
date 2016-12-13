package com.example.anton.pizzasapplication.objectModels;

import android.content.Context;
import android.util.Printer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.anton.pizzasapplication.R;

import java.util.ArrayList;

/**
 * Created by anton on 12/13/2016.
 */

public class RowMenuAdapter extends BaseAdapter {

    private ArrayList<RowData> m_rowListMenu;
    private LayoutInflater m_layoutInflater;

    public RowMenuAdapter(Context aContext, ArrayList<RowData> aListData) {
        this.m_rowListMenu = aListData;
        m_layoutInflater = LayoutInflater.from(aContext);
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
        holder.textView.setText(m_rowListMenu.get(i).getText() + String.valueOf(i));
        holder.imageButton.setImageResource(m_rowListMenu.get(i).getButton());

        holder.imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(m_layoutInflater.getContext(), "Selected: " + holder.textView.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
    static class ViewHolder {
        ImageView imageView;
        TextView textView;
        ImageButton imageButton;
    }
}
