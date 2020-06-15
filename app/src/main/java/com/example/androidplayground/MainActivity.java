package com.example.androidplayground;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int counter = 0;
    String counterDisplayContent;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ijustwantittolookok);

        final Button increment = findViewById(R.id.button2);
        final Button decrement = findViewById(R.id.button3);
        final TextView counterDisplay = findViewById(R.id.textView2);


        increment.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                counter++;
                counterDisplayContent = "I've been incremented, I am now: " + counter;
                Log.i("What is a tag?","Hello gamers! I've been clicked " + counter + " times");

                counterDisplay.setText(counterDisplayContent);
            }
        });

        decrement.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                counter--;
                counterDisplayContent = "I've been decremented, I am now: " + counter;

                counterDisplay.setText(counterDisplayContent);
            }
        });
    }
}