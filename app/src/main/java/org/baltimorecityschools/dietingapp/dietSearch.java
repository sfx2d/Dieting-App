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
    TextView testText;
    MaterialCardView appleSauceFrenchToastMCV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_search);
        appleSauceFrenchToastMCV = findViewById(R.id.appleSauceFrenchToastMCV);






        appleSauceFrenchToastMCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reusableInfoDisplay = new Intent(dietSearch.this, ReusableInfoDisplay.class);

                startActivity(reusableInfoDisplay);


            }
        });

        //testText = findViewById(R.id.testText);

        //ArrayList<String>recipeIngredients = new ArrayList<>();
        //recipeIngredients.add("2 eggs, 1/2 cup nonfat or 1% milk, 1 teaspoon cinnamon, 2 teaspoons sugar, 1/2 teaspoon vanilla, 1/4 cup unsweetened applesauce, 6 slices whole-wheat bread");
        //DietList newDietList = new DietList("AppleSauce French Toast ", 5.32, 140, recipeIngredients);
        //testText.setText("" + newDietList.getRecipeName() + "\n" + "$" + newDietList.getRecipeCost() + "\n" + "Calories: " + newDietList.calorieCount + "\n" + "Ingredient Info: " + newDietList.getDietRecipeIngredients());



    }
}