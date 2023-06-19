package com.example.calculators;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SubtractActivity extends AppCompatActivity {

    private EditText editTextNumber1, editTextNumber2;
    private Button buttonCalculate;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        editTextNumber1 = findViewById(R.id.editTextNumber1);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        textViewResult = findViewById(R.id.textViewResult);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateSubtraction();
            }
        });
    }

    private void calculateSubtraction() {
        String number1Str = editTextNumber1.getText().toString();
        String number2Str = editTextNumber2.getText().toString();

        if (!number1Str.isEmpty() && !number2Str.isEmpty()) {
            double number1 = Double.parseDouble(number1Str);
            double number2 = Double.parseDouble(number2Str);

            double result = number1 - number2;

            textViewResult.setText(String.valueOf(result));
        } else {
            textViewResult.setText("Digite ambos os números");
        }
    }
}
