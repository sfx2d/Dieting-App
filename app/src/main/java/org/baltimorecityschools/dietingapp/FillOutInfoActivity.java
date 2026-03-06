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

public class FillOutInfoActivity extends AppCompatActivity {
    Button nextBTN, backBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_out_info);
        nextBTN = findViewById(R.id.nextBTN);
        backBTN = findViewById(R.id.backBTN);


        backBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBackIntent = new Intent(FillOutInfoActivity.this, MainActivity.class);

                startActivity(goBackIntent);
            }
        });
    }
}