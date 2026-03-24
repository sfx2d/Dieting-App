package org.baltimorecityschools.dietingapp;

import android.content.Intent;import android.os.Bundle;import android.view.View;import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SettingsActivity extends AppCompatActivity {
    Button bgColorButton, fontButton, languageButton, settingsMainMenuButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        fontButton = findViewById(R.id.fontButton);
        languageButton = findViewById(R.id.languageButton);
        settingsMainMenuButton = findViewById(R.id.settingsMainMenuButton);
        bgColorButton = findViewById(R.id.bgColorButton);



        bgColorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bgColorIntent = new Intent(SettingsActivity.this, backroundColorChange.class);

                startActivity(bgColorIntent);

            }
        });
        settingsMainMenuButton.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View view) {
                Intent settingMainIntent = new Intent(SettingsActivity.this, MainActivity.class);


                startActivity(settingMainIntent);
            }});
    }
}