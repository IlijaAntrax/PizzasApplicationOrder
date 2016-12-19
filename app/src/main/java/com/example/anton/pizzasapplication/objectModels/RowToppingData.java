package com.example.anton.pizzasapplication.objectModels;

/**
 * Created by anton on 12/19/2016.
 */

public class RowToppingData {
    private int m_imageTopping;
    private String m_textTopping;
    private float m_priceTopping;

    public void setM_imageTopping(int m_imageTopping) {
        this.m_imageTopping = m_imageTopping;
    }

    public void setM_textTopping(String m_textTopping) {
        this.m_textTopping = m_textTopping;
    }

    public void setM_priceTopping(float m_priceTopping) {
        this.m_priceTopping = m_priceTopping;
    }

    public int getM_imageTopping() {
        return m_imageTopping;
    }

    public String getM_textTopping() {
        return m_textTopping;
    }

    public float getM_priceTopping() {
        return m_priceTopping;
    }
}
