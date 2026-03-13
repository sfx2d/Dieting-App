package org.baltimorecityschools.dietingapp;

import java.util.ArrayList;

public class DietList {
    public String recipeName;
    public double recipeCost;
    public int calorieCount;
    public ArrayList<String>dietRecipeIngredients;

    public DietList(){
        recipeName = "";
        recipeCost = 0.00;
        calorieCount = 0;
        
    }

}
