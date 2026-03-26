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
        dietRecipeIngredients = new ArrayList<String>();
    }

    public DietList(String recipeName, double recipeCost, int calorieCount, ArrayList<String> dietRecipeIngredients) {
        this.recipeName = recipeName;
        this.recipeCost = recipeCost;
        this.calorieCount = calorieCount;
        this.dietRecipeIngredients = dietRecipeIngredients;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public double getRecipeCost() {
        return recipeCost;
    }

    public void setRecipeCost(double recipeCost) {
        this.recipeCost = recipeCost;
    }

    public int getCalorieCount() {
        return calorieCount;
    }

    public void setCalorieCount(int calorieCount) {
        this.calorieCount = calorieCount;
    }

    public ArrayList<String> getDietRecipeIngredients() {
        return dietRecipeIngredients;
    }

    public void setDietRecipeIngredients(ArrayList<String> dietRecipeIngredients) {
        this.dietRecipeIngredients = dietRecipeIngredients;
    }
}
