
package com.example.lekcja3_onclick_zad2;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textCounter;
    private int counter = 0;

    private final View.OnClickListener counterListener = v -> {
        int id = v.getId();

        if (id == R.id.buttonPlus) {
            counter++;
            updateCounter();
        } else if (id == R.id.buttonMinus) {
            if (counter > 0) {
                counter--;
                updateCounter();
            } else {
                Toast.makeText(
                        MainActivity.this,
                        "Licznik nie może być mniejszy od zera",
                        Toast.LENGTH_SHORT
                ).show();
            }
        } else if (id == R.id.buttonReset) {
            counter = 0;
            updateCounter();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textCounter = findViewById(R.id.textCounter);

        if (savedInstanceState != null) {
            counter = savedInstanceState.getInt("counter", 0);
        }

        updateCounter();

        findViewById(R.id.buttonPlus).setOnClickListener(counterListener);
        findViewById(R.id.buttonMinus).setOnClickListener(counterListener);
        findViewById(R.id.buttonReset).setOnClickListener(counterListener);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("counter", counter);
        super.onSaveInstanceState(outState);
    }

    private void updateCounter() {
        textCounter.setText(String.valueOf(counter));
    }
}
