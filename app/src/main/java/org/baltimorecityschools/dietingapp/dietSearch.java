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




        //Below each comment are what foods' ingredients it is referring to.

        //AppleSauce French Toast ingredients

        //Any Berry Sauce ingredients

        //BreakFast Burritos ingredients

        //Oven Baked Salmon ingredients

        //Baked Meat Balls ingredients

        //Cheesy Beef Pasta ingredients

        //Fiesta Barley Salad ingredients

        //Lentil Taco Filling


        appleSauceFrenchToastMCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<String>recipeIngredients = new ArrayList<String>();
                recipeIngredients.add("2 eggs, 1/2 cup nonfat or 1% milk, 1 teaspoon cinnamon, 2 teaspoons sugar, 1/2 teaspoon vanilla, 1/4 cup unsweetened applesauce, 6 slices whole-wheat bread");
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
                ArrayList<String>recipeIngredients = new ArrayList<String>();
                recipeIngredients.add(0,"1/4 cup cold water, 1 Tablespoon cornstarch, 1/3 cup sugar 4 cups berries, fresh or frozen (blackberries, raspberries, blueberries, sliced strawberries, or a mixture)");
                Intent reusableInfoDisplay = new Intent(dietSearch.this, ReusableInfoDisplay.class);
                reusableInfoDisplay.putExtra("TEXT_DATA", recipeIngredients.get(0));
                DietList newDietList = new DietList("Any Berry Sauce ", 4.92, 60, recipeIngredients);
                String recipe = ("" + newDietList.getRecipeName() + "\n" + "$" + newDietList.getRecipeCost() + "\n" + "Calories: " + newDietList.calorieCount + "\n" + "Ingredient Info: " + newDietList.getDietRecipeIngredients());
                reusableInfoDisplay.putExtra("TEXT", recipe);

                startActivity(reusableInfoDisplay);
            }
        });

        breakFastBurritosMCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<String>recipeIngredients = new ArrayList<String>();
                recipeIngredients.add(0,"4 eggs, 1/4 cup nonfat or 1% milk, salt, pepper and chili powder to taste, 1 teaspoon vegetable oil, 4 (10-inch) flour tortillas, 1 cup fat-free refried beans, 1/2 cup (2 ounces) grated cheddar cheese, 1 tomato, chopped");
                Intent reusableInfoDisplay = new Intent(dietSearch.this, ReusableInfoDisplay.class);
                reusableInfoDisplay.putExtra("TEXT_DATA", recipeIngredients.get(0));
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
                ArrayList<String>recipeIngredients = new ArrayList<String>();
                recipeIngredients.add(0,"1 Tablespoon vegetable oil, 12 to 16 ounces fresh or thawed salmon, cut into 3 or 4 pieces of similar size, 1/4 teaspoon salt, 1/4 teaspoon pepper");
                reusableInfoDisplay.putExtra("TEXT_DATA", recipeIngredients.get(0));
                DietList newDietList = new DietList("Oven Baked Salmon ", 4.56, 160, recipeIngredients);
                String recipe = ("" + newDietList.getRecipeName() + "\n" + "$" + newDietList.getRecipeCost() + "\n" + "Calories: " + newDietList.calorieCount + "\n" + "Ingredient Info: " + newDietList.getDietRecipeIngredients());
                reusableInfoDisplay.putExtra("TEXT", recipe);

                startActivity(reusableInfoDisplay);

            }
        });

        bakedMeatBallsMCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<String>recipeIngredients = new ArrayList<String>();
                recipeIngredients.add(0,"1/2 cup finely grated carrot, 1 egg, 1/2 cup oats (old fashioned or quick-cooking), 1/4 cup skim or 1% milk, 1/2 teaspoon salt, 1/2 teaspoon pepper, 1/2 teaspoon garlic powder, 1/2 teaspoon onion powder, 1/2 teaspoon oregano, 1 pound lean ground meat (any type, 15% fat or less)");
                Intent reusableInfoDisplay = new Intent(dietSearch.this, ReusableInfoDisplay.class);
                reusableInfoDisplay.putExtra("TEXT_DATA", recipeIngredients.get(0));
                DietList newDietList = new DietList("Baked Meatballs ", 4.30, 150, recipeIngredients);
                String recipe = ("" + newDietList.getRecipeName() + "\n" + "$" + newDietList.getRecipeCost() + "\n" + "Calories: " + newDietList.calorieCount + "\n" + "Ingredient Info: " + newDietList.getDietRecipeIngredients());
                reusableInfoDisplay.putExtra("TEXT", recipe);

                startActivity(reusableInfoDisplay);

            }
        });

        cheesyBeefPastaMCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<String>recipeIngredients = new ArrayList<String>();
                recipeIngredients.add(0,"1/2 pound lean ground beef (15% fat)\n" +
                        "1 onion, diced (about 1 cup)\n" +
                        "2 cloves garlic, minced, or 1/2 teaspoon garlic powder\n" +
                        "1 small zucchini, chopped (about 1 1/2 cups)\n" +
                        "1 jar (24 to 26 ounces) tomato-based pasta sauce\n" +
                        "1/2 teaspoon dried basil\n" +
                        "1/2teaspoon dried oregano\n" +
                        "1/4 teaspoon red pepper flakes (optional)\n" +
                        "12 ounces rotini pasta (about 4 cups)\n" +
                        "1/2 cup (2 ounces) shredded cheddar cheese\n" +
                        "1 1/2 cups (6 ounces) shredded mozzarella cheese");
                Intent reusableInfoDisplay = new Intent(dietSearch.this, ReusableInfoDisplay.class);
                reusableInfoDisplay.putExtra("TEXT_DATA", recipeIngredients.get(0));
                DietList newDietList = new DietList("Cheesy Beef Pasta ", 4.99, 380, recipeIngredients);
                String recipe = ("" + newDietList.getRecipeName() + "\n" + "$" + newDietList.getRecipeCost() + "\n" + "Calories: " + newDietList.calorieCount + "\n" + "Ingredient Info: " + newDietList.getDietRecipeIngredients());
                reusableInfoDisplay.putExtra("TEXT", recipe);

                startActivity(reusableInfoDisplay);

            }
        });

        fiestaBarleySaladMCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<String>recipeIngredients = new ArrayList<String>();
                recipeIngredients.add(0,"1 cup pearl barley*\n" +
                        "3 cups water\n" +
                        "1/4 cup raisins, or other dried fruit\n" +
                        "1 cup frozen peas, or other vegetables (fresh, frozen or canned and drained)\n" +
                        "3 cups chopped lettuce\n" +
                        "1 can (15 ounces) mandarin oranges, drained\n" +
                        "1/2 cup sliced green onion (try any type of onion)\n" +
                        "1 Tablespoon vinegar (rice vinegar or any others)\n" +
                        "3 Tablespoons vegetable oil");
                Intent reusableInfoDisplay = new Intent(dietSearch.this, ReusableInfoDisplay.class);
                reusableInfoDisplay.putExtra("TEXT_DATA", recipeIngredients.get(0));
                DietList newDietList = new DietList("Fiesta Barley Salad ", 5.11, 150, recipeIngredients);
                String recipe = ("" + newDietList.getRecipeName() + "\n" + "$" + newDietList.getRecipeCost() + "\n" + "Calories: " + newDietList.calorieCount + "\n" + "Ingredient Info: " + newDietList.getDietRecipeIngredients());
                reusableInfoDisplay.putExtra("TEXT", recipe);

                startActivity(reusableInfoDisplay);

            }
        });

        lentilTacoFillingMCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<String>recipeIngredients = new ArrayList<String>();
                recipeIngredients.add(0,"1/2 cup chopped onion\n" +
                        "1/2 cup chopped bell pepper (any color)\n" +
                        "1/4 teaspoon garlic powder or 1 clove garlic, minced\n" +
                        "1 teaspoon oil\n" +
                        "1/2 cup dried lentils, rinsed\n" +
                        "4 1/2 teaspoons chili powder\n" +
                        "1 teaspoon ground cumin\n" +
                        "1/2 teaspoon dried cilantro or oregano (optional)\n" +
                        "1 1/4 cups broth, any flavor");
                Intent reusableInfoDisplay = new Intent(dietSearch.this, ReusableInfoDisplay.class);
                reusableInfoDisplay.putExtra("TEXT_DATA", recipeIngredients.get(0));
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