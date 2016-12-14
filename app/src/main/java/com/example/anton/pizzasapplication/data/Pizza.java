package com.example.anton.pizzasapplication.data;

import java.util.ArrayList;

/**
 * Created by anton on 12/14/2016.
 */

public class Pizza extends FoodItem {

    public TypePizza m_typePizza;

    private ArrayList<Topping> m_toppings;

    private TypeSize m_Size;
    private TypeCrustPizza m_Crust;
    private boolean m_shapeSquare = false;

    public Pizza(TypePizza typePizza, TypeCrustPizza crustPizza) {
        m_typePizza = typePizza;
        m_Crust = crustPizza;
        m_toppings = new ArrayList<Topping>();
    }

    public void addTopping(Topping topping) {
        if (topping.m_typeFood.contains(TypeFood.PIZZA)) {
            m_toppings.add(topping);
        }
    }
    public boolean removeTopping(Topping topping) {
        if (topping.m_typeFood.contains(TypeFood.PIZZA) && m_toppings.contains(topping)) {
            return m_toppings.remove(topping);
        }
        return false;
    }
    public void removeAllToppings() {
        m_toppings.clear();
    }

    public void setM_Size(TypeSize size) {
        m_Size = size;
    }
    public TypeSize getM_Size() {
        return m_Size;
    }

}