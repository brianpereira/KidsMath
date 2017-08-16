package org.dyndns.brianpereira.brian.kidsmath;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

/**
 * Created by Brian on 16/08/2017.
 */

public class Credits extends AppCompatActivity {

    private TextView textViewCredits;
    private Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);

        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.credits);
        textViewCredits = (TextView) findViewById(R.id.textViewCredits);
        textViewCredits.setText(getString(R.string.txtCreditsMessage)); // Gets the string from strings.xml



    }
}
