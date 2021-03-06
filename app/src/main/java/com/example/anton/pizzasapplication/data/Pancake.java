package com.example.anton.pizzasapplication.data;

import java.util.ArrayList;

/**
 * Created by anton on 12/14/2016.
 */

public class Pancake extends FoodItem {

    private ArrayList<Topping> m_toppings;

    public Pancake() {
        m_toppings = new ArrayList<Topping>();
    }

    public void addTopping(Topping topping) {
        if (topping.m_typeFood.contains(TypeFood.PANCAKE)) {
            m_toppings.add(topping);
        }
    }
    public boolean removeTopping(Topping topping) {
        if (topping.m_typeFood.contains(TypeFood.PANCAKE) && m_toppings.contains(topping)) {
            return m_toppings.remove(topping);
        }
        return false;
    }
    public void removeAllToppings() {
        m_toppings.clear();
    }
}
