package com.example.calculators;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.calculators.R;

public class DivideActivity extends AppCompatActivity {

    private EditText editTextNumber1, editTextNumber2;
    private Button buttonCalculate;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divide);

        editTextNumber1 = findViewById(R.id.editTextNumber1);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        textViewResult = findViewById(R.id.textViewResult);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateDivision();
            }
        });
    }

    private void calculateDivision() {
        String number1Str = editTextNumber1.getText().toString();
        String number2Str = editTextNumber2.getText().toString();

        if (!number1Str.isEmpty() && !number2Str.isEmpty()) {
            double number1 = Double.parseDouble(number1Str);
            double number2 = Double.parseDouble(number2Str);

            if (number2 != 0) {
                double result = number1 / number2;
                textViewResult.setText(String.valueOf(result));
            } else {
                textViewResult.setText("Divisão por zero não é permitida");
            }
        } else {
            textViewResult.setText("Digite ambos os números");
        }
    }
}
