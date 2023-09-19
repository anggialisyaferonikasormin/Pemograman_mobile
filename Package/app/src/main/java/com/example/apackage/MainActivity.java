package com.example.apackage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edtLength, edtWidth;
    private Button btnCalculate;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtLength = findViewById(R.id.edt_length);
        edtWidth = findViewById(R.id.edt_width);
        btnCalculate = findViewById(R.id.btn_calculate);
        tvResult = findViewById(R.id.tv_result);

        btnCalculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_calculate) {
            String inputLength = edtLength.getText().toString().trim();
            String inputWidth = edtWidth.getText().toString().trim();

            if (!inputLength.isEmpty() && !inputWidth.isEmpty()) {
                double length = Double.parseDouble(inputLength);
                double width = Double.parseDouble(inputWidth);

                // Hitung luas dan keliling persegi panjang//
                double area = length * width;
                double perimeter = 2 * (length + width);

                String resultText = "Luas: " + area + "\nKeliling: " + perimeter;
                tvResult.setText(resultText);
            } else {
                tvResult.setText("Masukkan panjang dan lebar.");
            }
        }
    }
}