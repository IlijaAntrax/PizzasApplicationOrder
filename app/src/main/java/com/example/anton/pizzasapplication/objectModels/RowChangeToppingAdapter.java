package com.example.anton.pizzasapplication.objectModels;

import android.content.Context;
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
 * Created by anton on 12/19/2016.
 */

public class RowChangeToppingAdapter extends BaseAdapter{

    private ArrayList<RowToppingData> m_rowToppingData;
    private Context m_Context;
    private LayoutInflater m_layoutInflater;

    public RowChangeToppingAdapter(Context aContext) {
        m_rowToppingData = new ArrayList<RowToppingData>();
        m_Context = aContext;
        m_layoutInflater = LayoutInflater.from(aContext);
    }
    public RowChangeToppingAdapter(Context aContext, ArrayList<RowToppingData> aRowData) {
        m_rowToppingData = aRowData;
        m_Context = aContext;
        m_layoutInflater = LayoutInflater.from(aContext);
    }
    @Override
    public int getCount() {
        return m_rowToppingData.size();
    }

    @Override
    public Object getItem(int i) {
        return m_rowToppingData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final ViewHolderTopping holder;
        if (view == null) {
            view = m_layoutInflater.inflate(R.layout.listview_rowtoppings, null);
            holder = new ViewHolderTopping();
            holder.imageView = (ImageView) view.findViewById(R.id.imageView_rowToppingImage);
            holder.textView = (TextView) view.findViewById(R.id.textView_rowToppingText);
            holder.textViewPrice = (TextView) view.findViewById(R.id.textView_rowToppingPrice);
            holder.imageButtonAdd = (ImageButton) view.findViewById(R.id.imageButton_rowAddTopping);
            holder.imageButtonRemove = (ImageButton) view.findViewById(R.id.imageButton_rowRemoveTopping);
            view.setTag(holder);
        } else {
            holder = (ViewHolderTopping) view.getTag();
        }

        holder.imageView.setImageResource(m_rowToppingData.get(i).getM_imageTopping());
        holder.textView.setText(m_rowToppingData.get(i).getM_textTopping());
        holder.textViewPrice.setText(Float.toString(m_rowToppingData.get(i).getM_priceTopping()));
        holder.imageButtonAdd.setImageResource(R.drawable.common_google_signin_btn_icon_dark_normal);
        holder.imageButtonRemove.setImageResource(R.drawable.common_google_signin_btn_icon_dark_focused);

        return view;
    }
    static class ViewHolderTopping {
        ImageView imageView;
        TextView textView;
        TextView textViewPrice;
        ImageButton imageButtonAdd;
        ImageButton imageButtonRemove;
    }
}
