package org.baltimorecityschools.dietingapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;

public class dietSearch extends AppCompatActivity {

    MaterialCardView appleSauceFrenchToastMCV, anyBerrySauceMCV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_search);
        appleSauceFrenchToastMCV = findViewById(R.id.appleSauceFrenchToastMCV);
        anyBerrySauceMCV = findViewById(R.id.anyBerrySauceMCV);

        ArrayList<String>recipeIngredients = new ArrayList<String>();
        recipeIngredients.add("2 eggs, 1/2 cup nonfat or 1% milk, 1 teaspoon cinnamon, 2 teaspoons sugar, 1/2 teaspoon vanilla, 1/4 cup unsweetened applesauce, 6 slices whole-wheat bread");
        recipeIngredients.add("1/4 cup cold water, 1 Tablespoon cornstarch, 1/3 cup sugar 4 cups berries, fresh or frozen (blackberries, raspberries, blueberries, sliced strawberries, or a mixture)");

        appleSauceFrenchToastMCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reusableInfoDisplay = new Intent(dietSearch.this, ReusableInfoDisplay.class);
                reusableInfoDisplay.putExtra("TEXT_DATA",recipeIngredients.get(0));
                DietList newDietList = new DietList("AppleSauce French Toast ", 5.32, 140, recipeIngredients);
                String recipe = ("" + newDietList.getRecipeName() + "\n" + "$" + newDietList.getRecipeCost() + "\n" + "Calories: " + newDietList.calorieCount + "\n" + "Ingredient Info: " + newDietList.getDietRecipeIngredients());
                reusableInfoDisplay.putExtra("TEXT", recipe);

                startActivity(reusableInfoDisplay);


            }
        });

        anyBerrySauceMCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reusableInfoDisplay = new Intent(dietSearch.this, ReusableInfoDisplay.class);
                reusableInfoDisplay.putExtra("TEXT_DATA", recipeIngredients.get(1));

                startActivity(reusableInfoDisplay);
            }
        });



        //ArrayList<String>recipeIngredients = new ArrayList<>();
        //recipeIngredients.add("2 eggs, 1/2 cup nonfat or 1% milk, 1 teaspoon cinnamon, 2 teaspoons sugar, 1/2 teaspoon vanilla, 1/4 cup unsweetened applesauce, 6 slices whole-wheat bread");
        //DietList newDietList = new DietList("AppleSauce French Toast ", 5.32, 140, recipeIngredients);
        //testText.setText("" + newDietList.getRecipeName() + "\n" + "$" + newDietList.getRecipeCost() + "\n" + "Calories: " + newDietList.calorieCount + "\n" + "Ingredient Info: " + newDietList.getDietRecipeIngredients());



    }
}