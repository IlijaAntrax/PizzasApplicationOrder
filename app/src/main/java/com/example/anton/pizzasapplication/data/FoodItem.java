package com.example.anton.pizzasapplication.data;

/**
 * Created by anton on 12/14/2016.
 */


public abstract class FoodItem {

    private String m_Name;
    private Float m_Price;
    private int m_Picture;
    private Float m_Weight;

    public void setM_Name(String name) {
        m_Name = name;
    }
    public String getM_Name() {
        return m_Name;
    }
    public void setM_Price(Float price) {
        m_Price = price;
    }

    public Float getM_Price() {
        return m_Price;
    }

    public void setM_Picture(int m_Picture) {
        this.m_Picture = m_Picture;
    }

    public int getM_Picture() {
        return m_Picture;
    }

    public void setM_Weight(Float m_Weight) {
        this.m_Weight = m_Weight;
    }

    public Float getM_Weight() {
        return m_Weight;
    }

}
