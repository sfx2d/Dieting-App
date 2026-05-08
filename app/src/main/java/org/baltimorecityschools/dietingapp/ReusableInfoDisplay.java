package org.baltimorecityschools.dietingapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ReusableInfoDisplay extends AppCompatActivity {

    TextView changeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reusable_info_display);

        changeText = findViewById(R.id.changeText);

        String infoText = getIntent().getStringExtra("TEXT");

        changeText.setText(infoText);
        //changeText.setText("" + newDietList.getRecipeName() + "\n" + "$" + newDietList.getRecipeCost() + "\n" + "Calories: " + newDietList.calorieCount + "\n" + "Ingredient Info: " + newDietList.getDietRecipeIngredients());


    }
}