package com.example.anton.pizzasapplication.objectModels;

import android.widget.ImageButton;
import android.widget.ImageView;

/**
 * Created by anton on 12/13/2016.
 */

public class RowData {

    private int m_imageMenu;
    private String m_textMenu;
    private int m_buttonMenu;

    public void setImage(int image) {
        m_imageMenu = image;
    }
    public int getImage() {
        return m_imageMenu;
    }
    public void setText(String text) {
        m_textMenu = text;
    }
    public String getText() {
        return m_textMenu;
    }
    public void setButton(int button) {
        m_buttonMenu = button;
    }
    public int getButton() {
        return m_buttonMenu;
    }
}
