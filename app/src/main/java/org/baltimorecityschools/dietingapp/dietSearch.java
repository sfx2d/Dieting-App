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

    MaterialCardView appleSauceFrenchToastMCV, anyBerrySauceMCV, breakFastBurritosMCV, ovenBakedSalmonMCV, bakedMeatBallsMCV, cheesyBeefPastaMCV, fiestaBarleySaladMCV, lentilTacoFillingMCV;
    ArrayList<String> recipeIngredients;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_search);
        appleSauceFrenchToastMCV = findViewById(R.id.appleSauceFrenchToastMCV);
        anyBerrySauceMCV = findViewById(R.id.anyBerrySauceMCV);
        breakFastBurritosMCV = findViewById(R.id.breakFastBurritosMCV);
        ovenBakedSalmonMCV = findViewById(R.id.ovenBakedSalmonMCV);
        bakedMeatBallsMCV = findViewById(R.id.bakedMeatBallsMCV);
        cheesyBeefPastaMCV = findViewById(R.id.cheesyBeefPastaMCV);
        fiestaBarleySaladMCV = findViewById(R.id.fiestaBarleySaladMCV);
        lentilTacoFillingMCV = findViewById(R.id.lentilTacoFillingMCV);


        ArrayList<String>recipeIngredients = new ArrayList<String>();

        //Below each comment are what foods' ingredients it is referring to.

        //AppleSauce French Toast ingredients
        recipeIngredients.add(0, "2 eggs, 1/2 cup nonfat or 1% milk, 1 teaspoon cinnamon, 2 teaspoons sugar, 1/2 teaspoon vanilla, 1/4 cup unsweetened applesauce, 6 slices whole-wheat bread");
        //Any Berry Sauce ingredients
        //recipeIngredients.add(1,"1/4 cup cold water, 1 Tablespoon cornstarch, 1/3 cup sugar 4 cups berries, fresh or frozen (blackberries, raspberries, blueberries, sliced strawberries, or a mixture)");
        //BreakFast Burritos ingredients
        //recipeIngredients.add(2,"4 eggs, 1/4 cup nonfat or 1% milk, salt, pepper and chili powder to taste, 1 teaspoon vegetable oil, 4 (10-inch) flour tortillas, 1 cup fat-free refried beans, 1/2 cup (2 ounces) grated cheddar cheese, 1 tomato, chopped");
        //Oven Baked Salmon ingredients
        //recipeIngredients.add(3,"1 Tablespoon vegetable oil, 12 to 16 ounces fresh or thawed salmon, cut into 3 or 4 pieces of similar size, 1/4 teaspoon salt, 1/4 teaspoon pepper");
        //Baked Meat Balls ingredients
        //recipeIngredients.add(4,"1/2 cup finely grated carrot, 1 egg, 1/2 cup oats (old fashioned or quick-cooking), 1/4 cup skim or 1% milk, 1/2 teaspoon salt, 1/2 teaspoon pepper, 1/2 teaspoon garlic powder, 1/2 teaspoon onion powder, 1/2 teaspoon oregano, 1 pound lean ground meat (any type, 15% fat or less)");
        //Cheesy Beef Pasta ingredients
        //recipeIngredients.add(5,"/2 pound lean ground beef (15% fat), 1 onion, diced (about 1 cup), 2 cloves garlic, minced, or 1/2 teaspoon garlic powder, 1 small zucchini, chopped (about 1 1/2 cups), 1 jar (24 to 26 ounces) tomato-based pasta sauce, 1/2 teaspoon dried basil, 1/2teaspoon dried oregano, 1/4 teaspoon red pepper flakes (optional), 12 ounces rotini pasta (about 4 cups), 1/2 cup (2 ounces) shredded cheddar cheese, 1 1/2 cups (6 ounces) shredded mozzarella cheese");
        //Fiesta Barley Salad ingredients
       //recipeIngredients.add(6,"1 cup pearl barley*, 3 cups water, 1/4 cup raisins, or other dried fruit, 1 cup frozen peas, or other vegetables (fresh, frozen or canned and drained), 3 cups chopped lettuce, 1 can (15 ounces) mandarin oranges, drained, 1/2 cup sliced green onion (try any type of onion), 1 Tablespoon vinegar (rice vinegar or any others), 3 Tablespoons vegetable oil");
        //Lentil Taco Filling
        //recipeIngredients.add(7,"1/2 cup chopped onion, 1/2 cup chopped bell pepper (any color), 1/4 teaspoon garlic powder or 1 clove garlic, minced, 1 teaspoon oil, 1/2 cup dried lentils, rinsed, 4 1/2 teaspoons chili powder, 1 teaspoon ground cumin, 1/2 teaspoon dried cilantro or oregano (optional), 1 1/4 cups broth, any flavor");

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
                DietList newDietList = new DietList("Any Berry Sauce ", 4.92, 60, recipeIngredients);
                String recipe = ("" + newDietList.getRecipeName() + "\n" + "$" + newDietList.getRecipeCost() + "\n" + "Calories: " + newDietList.calorieCount + "\n" + "Ingredient Info: " + newDietList.getDietRecipeIngredients());
                reusableInfoDisplay.putExtra("TEXT", recipe);

                startActivity(reusableInfoDisplay);
            }
        });

        breakFastBurritosMCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reusableInfoDisplay = new Intent(dietSearch.this, ReusableInfoDisplay.class);
                reusableInfoDisplay.putExtra("TEXT_DATA", recipeIngredients.get(2));
                DietList newDietList = new DietList("Breakfast Burritos ", 5.67, 210, recipeIngredients);
                String recipe = ("" + newDietList.getRecipeName() + "\n" + "$" + newDietList.getRecipeCost() + "\n" + "Calories: " + newDietList.calorieCount + "\n" + "Ingredient Info: " + newDietList.getDietRecipeIngredients());
                reusableInfoDisplay.putExtra("TEXT", recipe);

                startActivity(reusableInfoDisplay);

            }
        });

        ovenBakedSalmonMCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reusableInfoDisplay = new Intent(dietSearch.this, ReusableInfoDisplay.class);
                reusableInfoDisplay.putExtra("TEXT_DATA", recipeIngredients.get(3));
                DietList newDietList = new DietList("Oven Baked Salmon ", 4.56, 160, recipeIngredients);
                String recipe = ("" + newDietList.getRecipeName() + "\n" + "$" + newDietList.getRecipeCost() + "\n" + "Calories: " + newDietList.calorieCount + "\n" + "Ingredient Info: " + newDietList.getDietRecipeIngredients());
                reusableInfoDisplay.putExtra("TEXT", recipe);

                startActivity(reusableInfoDisplay);

            }
        });

        bakedMeatBallsMCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reusableInfoDisplay = new Intent(dietSearch.this, ReusableInfoDisplay.class);
                reusableInfoDisplay.putExtra("TEXT_DATA", recipeIngredients.get(4));
                DietList newDietList = new DietList("Baked Meatballs ", 4.30, 150, recipeIngredients);
                String recipe = ("" + newDietList.getRecipeName() + "\n" + "$" + newDietList.getRecipeCost() + "\n" + "Calories: " + newDietList.calorieCount + "\n" + "Ingredient Info: " + newDietList.getDietRecipeIngredients());
                reusableInfoDisplay.putExtra("TEXT", recipe);

                startActivity(reusableInfoDisplay);

            }
        });

        cheesyBeefPastaMCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reusableInfoDisplay = new Intent(dietSearch.this, ReusableInfoDisplay.class);
                reusableInfoDisplay.putExtra("TEXT_DATA", recipeIngredients.get(5));
                DietList newDietList = new DietList("Cheesy Beef Pasta ", 4.99, 380, recipeIngredients);
                String recipe = ("" + newDietList.getRecipeName() + "\n" + "$" + newDietList.getRecipeCost() + "\n" + "Calories: " + newDietList.calorieCount + "\n" + "Ingredient Info: " + newDietList.getDietRecipeIngredients());
                reusableInfoDisplay.putExtra("TEXT", recipe);

                startActivity(reusableInfoDisplay);

            }
        });

        fiestaBarleySaladMCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reusableInfoDisplay = new Intent(dietSearch.this, ReusableInfoDisplay.class);
                reusableInfoDisplay.putExtra("TEXT_DATA", recipeIngredients.get(6));
                DietList newDietList = new DietList("Fiesta Barley Salad ", 5.11, 150, recipeIngredients);
                String recipe = ("" + newDietList.getRecipeName() + "\n" + "$" + newDietList.getRecipeCost() + "\n" + "Calories: " + newDietList.calorieCount + "\n" + "Ingredient Info: " + newDietList.getDietRecipeIngredients());
                reusableInfoDisplay.putExtra("TEXT", recipe);

                startActivity(reusableInfoDisplay);

            }
        });

        lentilTacoFillingMCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reusableInfoDisplay = new Intent(dietSearch.this, ReusableInfoDisplay.class);
                reusableInfoDisplay.putExtra("TEXT_DATA", recipeIngredients.get(7));
                DietList newDietList = new DietList("Lentil Taco Filling ", 4.54, 60, recipeIngredients);
                String recipe = ("" + newDietList.getRecipeName() + "\n" + "$" + newDietList.getRecipeCost() + "\n" + "Calories: " + newDietList.calorieCount + "\n" + "Ingredient Info: " + newDietList.getDietRecipeIngredients());
                reusableInfoDisplay.putExtra("TEXT", recipe);

                startActivity(reusableInfoDisplay);
            }
        });



        //ArrayList<String>recipeIngredients = new ArrayList<>();
        //recipeIngredients.add("2 eggs, 1/2 cup nonfat or 1% milk, 1 teaspoon cinnamon, 2 teaspoons sugar, 1/2 teaspoon vanilla, 1/4 cup unsweetened applesauce, 6 slices whole-wheat bread");
        //DietList newDietList = new DietList("AppleSauce French Toast ", 5.32, 140, recipeIngredients);
        //testText.setText("" + newDietList.getRecipeName() + "\n" + "$" + newDietList.getRecipeCost() + "\n" + "Calories: " + newDietList.calorieCount + "\n" + "Ingredient Info: " + newDietList.getDietRecipeIngredients());



    }
}