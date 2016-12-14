package com.example.anton.pizzasapplication.data;

import java.util.ArrayList;

/**
 * Created by anton on 12/14/2016.
 */

public class Topping extends FoodItem {
    public TypeTopping m_typeTopping;
    public ArrayList<TypeFood> m_typeFood;

    public Topping(TypeTopping topping) {
        m_typeTopping = topping;
        m_typeFood = new ArrayList<TypeFood>();
    }
}
