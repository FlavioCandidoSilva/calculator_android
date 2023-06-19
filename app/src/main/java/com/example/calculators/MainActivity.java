package com.example.calculators;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.calculators.R;

public class MainActivity extends AppCompatActivity {

    private Button buttonSum, buttonSubtract, buttonMultiply, buttonDivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSum = findViewById(R.id.buttonSum);
        buttonSubtract = findViewById(R.id.buttonSubtract);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonDivide = findViewById(R.id.buttonDivide);

        buttonSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSumActivity();
            }
        });

        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSubtractActivity();
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMultiplyActivity();
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDivideActivity();
            }
        });
    }

    private void openSumActivity() {
        Intent intent = new Intent(this, SumActivity.class);
        startActivity(intent);
    }

    private void openSubtractActivity() {
        Intent intent = new Intent(this, SubtractActivity.class);
        startActivity(intent);
    }

    private void openMultiplyActivity() {
        Intent intent = new Intent(this, MultiplyActivity.class);
        startActivity(intent);
    }

    private void openDivideActivity() {
        Intent intent = new Intent(this, DivideActivity.class);
        startActivity(intent);
    }
}
