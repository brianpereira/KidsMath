package org.dyndns.brianpereira.brian.kidsmath;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Code for the Level 1 button
        Button btnLevel1 = (Button) findViewById(R.id.btnLevel1);
        // Add a listener
        btnLevel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // startActivity(new Intent(getApplicationContext(), Credits.class));
            }
        });

        // Code for the Level 2 button
        Button btnLevel2 = (Button) findViewById(R.id.btnLevel2);
        // Add a listener
        btnLevel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        // Code for the Level 3 button
        Button btnLevel3 = (Button) findViewById(R.id.btnLevel3);
        // Add a listener
        btnLevel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        // Code for the Credits button
        Button btnCredits = (Button) findViewById(R.id.bnCredits);
        // Add a listener
        btnCredits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Credits.class));
            }
        });

        // Code for the Exit button
        Button btnExit = (Button) findViewById(R.id.btnExit);
        // Add a listener
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
