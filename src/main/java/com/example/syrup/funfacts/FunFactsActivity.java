package com.example.syrup.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    public static final String TAG = FunFactsActivity.class.getSimpleName();
    private FactBook factBook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel();

    //Declare our View variables
    private TextView factTextView;
    private Button showFactButton;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        /* *** GOAL: Assign the Views from the layout file to the corresponding variables *** */

        // old versions of android require type casting: showFactButton factTextView =(TextView)findViewById(R.id.factTextView);
        factTextView = findViewById(R.id.factTextView);
        // old versions of android require type casting: showFactButton = (Button)findViewById(R.id.showFactButton)
        showFactButton = findViewById(R.id.showFactButton);
        //Set Relative layout to change background color with each fact
        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        /* *** GOAL: Set button to iterate through random facts with every click *** */

        //Set on click Listener
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Pick a random fact from factBook array
                String fact = factBook.getFact();

                //Update the screen with our new fact
                factTextView.setText(fact);

                /*Change background of app on every click */
                //Pick a random color from colorWheel array
                int color = colorWheel.getColor();

                //Set background to random color picked from colorWheel class
                relativeLayout.setBackgroundColor(color);

                //Change text color by using random number
                showFactButton.setTextColor(color);
            }
        };
        showFactButton.setOnClickListener(listener);

        //Toast.makeText(this, "Our Activity was created!", Toast.LENGTH_SHORT).show();
       Log.d(TAG, "We're logging from the onCreate() method!");

    }
}
