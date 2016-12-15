package com.example.anton.pizzasapplication.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.anton.pizzasapplication.R;
import com.example.anton.pizzasapplication.objectModels.RowData;
import com.example.anton.pizzasapplication.objectModels.RowMenuAdapter;

import java.util.ArrayList;

public class MenuFragment extends Fragment {

    private ListView m_listView_menu;
    private ArrayAdapter m_arrayAdapter;

    public MenuFragment() {
        // Required empty public constructor
        super();
    }

    public static MenuFragment newInstance(String param1, String param2) {
        MenuFragment fragment = new MenuFragment();
        Bundle args = new Bundle();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        //m_listView_menu = (ListView) getActivity().findViewById(R.id.listView_menu);
        //m_arrayAdapter = new ArrayAdapter(getContext(),R.layout.listview_rowmenu,monthsArray);
        //m_listView_menu.setAdapter(m_arrayAdapter);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu, container, false);
        ArrayList row_Menu = getListData();
        m_listView_menu = (ListView) view.findViewById(R.id.listView_menu);
        m_listView_menu.setAdapter(new RowMenuAdapter(getActivity(), getContext(),row_Menu));

        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }



    @Override
    public void onDetach() {
        super.onDetach();
    }

    private ArrayList getListData() {
        ArrayList<RowData> results = new ArrayList<RowData>();

        RowData rowData = new RowData();
        rowData.setImage(R.drawable.common_google_signin_btn_icon_dark_focused);
        rowData.setText("PIZZA");
        rowData.setButton(R.drawable.button_next);
        results.add(rowData);
        // Add some more dummy data for testing
        RowData rowData1 = new RowData();
        rowData1.setImage(R.drawable.common_google_signin_btn_icon_dark_focused);
        rowData1.setText("SANDWICH");
        rowData1.setButton(R.drawable.button_next);
        results.add(rowData1);

        RowData rowData2 = new RowData();
        rowData2.setImage(R.drawable.common_google_signin_btn_icon_dark_focused);
        rowData2.setText("PANCAKE");
        rowData2.setButton(R.drawable.button_next);
        results.add(rowData2);

        RowData rowData3 = new RowData();
        rowData3.setImage(R.drawable.common_google_signin_btn_icon_dark_focused);
        rowData3.setText("SALAD");
        rowData3.setButton(R.drawable.button_next);
        results.add(rowData3);

        RowData rowData4 = new RowData();
        rowData4.setImage(R.drawable.common_google_signin_btn_icon_dark_focused);
        rowData4.setText("PASTA");
        rowData4.setButton(R.drawable.button_next);
        results.add(rowData4);

        return results;
    }

}
