package org.baltimorecityschools.dietingapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class backroundColorChange extends AppCompatActivity {

    Button redButton, greenButton, blueButton, settingsReturnBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backround_color_change);
        redButton = findViewById(R.id.redButton);
        greenButton = findViewById(R.id.greenButton);
        blueButton = findViewById(R.id.blueButton);
        settingsReturnBTN = findViewById(R.id.settingsReturnBTN);

        settingsReturnBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent settingsReturnIntent = new Intent(backroundColorChange.this, SettingsActivity.class);

                startActivity(settingsReturnIntent);
            }
        });
    }
}