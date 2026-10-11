
package com.example.lekcja3_onclick_zad2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textCounter;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textCounter = findViewById(R.id.textCounter);

        Button buttonPlus = findViewById(R.id.buttonPlus);
        Button buttonMinus = findViewById(R.id.buttonMinus);
        Button buttonReset = findViewById(R.id.buttonReset);

        buttonPlus.setOnClickListener(v -> incrementCounter());

        buttonMinus.setOnClickListener(this::decrementCounter);

        View.OnClickListener resetListener = v -> resetCounter();
        buttonReset.setOnClickListener(resetListener);
    }

    private void incrementCounter() {
        counter++;
        updateCounter();
    }

    private void decrementCounter(View view) {
        if (counter > 0) {
            counter--;
            updateCounter();
        } else {
            Toast.makeText(this, "Licznik nie może być mniejszy od zera",
                    Toast.LENGTH_SHORT).show();
        }
    }

    private void resetCounter() {
        counter = 0;
        updateCounter();
    }

    private void updateCounter() {
        textCounter.setText(String.valueOf(counter));
    }
}
