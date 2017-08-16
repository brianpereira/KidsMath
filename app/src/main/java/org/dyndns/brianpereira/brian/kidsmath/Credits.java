package org.dyndns.brianpereira.brian.kidsmath;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Brian on 16/08/2017.
 */

public class Credits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
        TextView txtViewCredits = (TextView) findViewById(R.id.textViewCredits);

    }
}
