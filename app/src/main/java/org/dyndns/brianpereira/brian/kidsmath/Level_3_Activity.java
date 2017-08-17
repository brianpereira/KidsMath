package org.dyndns.brianpereira.brian.kidsmath;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

import java.util.Random;

public class Level_3_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_3);

        // Code for the start button
        Button buttonStart = (Button) findViewById(R.id.buttonStart);
        // Add a listener
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Generate random numbers
                Random random = new Random();
                int n1 = random.nextInt(10) + 1;  //  Max=10, Min=1
                int n2 = random.nextInt(10) + 1;  //  Max=10, Min=1

                // Assign the random numbers
                TextView textNumber1 = (TextView) findViewById(R.id.textNumber1);
                TextView textNumber2 = (TextView) findViewById(R.id.textNumber2);
                String strn1 = Integer.toString(n1);
                String strn2 = Integer.toString(n2);
                textNumber1.setText(strn1);
                textNumber2.setText(strn2);

                // Reset the result
                TextView textResult = (TextView) findViewById(R.id.textResult);
                textResult.setText("Result");

                // Start the chronometer
                Chronometer chronometer = (Chronometer) findViewById(R.id.chronometer);
                chronometer.setBase(SystemClock.elapsedRealtime());
                chronometer.start();
            }
        });

        // Code for the stop button
        Button buttonStop = (Button) findViewById(R.id.buttonStop);
        // Add a listener
        buttonStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Stop the chronometer
                Chronometer chronometer = (Chronometer) findViewById(R.id.chronometer);
                chronometer.stop();

                // Calculate the result
                TextView textNumber1 = (TextView) findViewById(R.id.textNumber1);
                TextView textNumber2 = (TextView) findViewById(R.id.textNumber2);
                TextView textResult = (TextView) findViewById(R.id.textResult);
                int n1 = Integer.parseInt(textNumber1.getText().toString());
                int n2 = Integer.parseInt(textNumber2.getText().toString());

                textResult.setText(n1 * n2 + "");
            }
        });
    }
}
