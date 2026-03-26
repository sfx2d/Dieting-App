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

public class additionalInformation extends AppCompatActivity {
    Button goBack, nextAgainBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_additional_information);
        goBack = findViewById(R.id.goBack);
        nextAgainBTN = findViewById(R.id.nextAgainBTN);

        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moreInfoIntent = new Intent(additionalInformation.this, FillOutInfoActivity.class);

                startActivity(moreInfoIntent);

            }
        });
        nextAgainBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToMainPage = new Intent(additionalInformation.this, dietSearch.class);

                startActivity(goToMainPage);
            }
        });

    }
}