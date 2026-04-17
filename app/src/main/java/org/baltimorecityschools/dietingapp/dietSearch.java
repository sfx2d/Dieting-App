package org.baltimorecityschools.dietingapp;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class dietSearch extends AppCompatActivity {
    TextView testText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_search);

        testText = findViewById(R.id.testText);

        ArrayList<String>recipeIngredients = new ArrayList<>();
        recipeIngredients.add("2 eggs, 1/2 cup nonfat or 1% milk, 1 teaspoon cinnamon, 2 teaspoons sugar, 1/2 teaspoon vanilla, 1/4 cup unsweetened applesauce, 6 slices whole-wheat bread");
        DietList newDietList = new DietList("AppleSauce French Toast ", 5.32, 140, recipeIngredients);
        testText.setText("" + newDietList.getRecipeName() + "\n" + newDietList.getRecipeCost() + "\n" + newDietList.calorieCount + "\n" + newDietList.getDietRecipeIngredients());



    }
}