package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView resultOfTextViews; //Объявляем объекты
    private EditText NumberField1, NumberField2;
    private Button buttonForPlus, buttonForMinus, buttonForProizv, buttonForDelenie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultOfTextViews = findViewById(R.id.resultOfTextViews); //даем название и присоединяем по айди
        NumberField1 = findViewById(R.id.NumberField1);
        NumberField2 = findViewById(R.id.NumberField2);
        buttonForPlus = findViewById(R.id.buttonForPlus);
        buttonForMinus = findViewById(R.id.buttonForMinus);
        buttonForProizv = findViewById(R.id.buttonForProizv);
        buttonForDelenie = findViewById(R.id.buttonForDelenie);

        buttonForPlus.setOnClickListener(new View.OnClickListener() { //Обработка события при клике
            @Override
            public void onClick(View view) {
                float num1 = Float.parseFloat(NumberField1.getText().toString());
                float num2 = Float.parseFloat(NumberField2.getText().toString());
                float res = num1 + num2;
                resultOfTextViews.setText(String.valueOf(res));

            }
        });
        buttonForMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = Float.parseFloat(NumberField1.getText().toString());
                float num2 = Float.parseFloat(NumberField2.getText().toString());
                float res = num1 - num2;
                resultOfTextViews.setText(String.valueOf(res));
            }
        });
        buttonForProizv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = Float.parseFloat(NumberField1.getText().toString());
                float num2 = Float.parseFloat(NumberField2.getText().toString());
                float res = num1 * num2;
                resultOfTextViews.setText(String.valueOf(res));
            }
        });
        buttonForDelenie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = Float.parseFloat(NumberField1.getText().toString());
                float num2 = Float.parseFloat(NumberField2.getText().toString());
                float res = num1 / num2;
                resultOfTextViews.setText(String.valueOf(res));
            }
        });

    }
}