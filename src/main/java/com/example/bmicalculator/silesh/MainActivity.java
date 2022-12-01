package com.example.bmicalculator.silesh;

import static com.example.bmicalculator.silesh.R.id.llmain;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtweight, edtheightft,edtheightin;
        Button btnCalculate;
        TextView txtresult;
        LinearLayout llmain;

        edtweight=findViewById(R.id.edtweight);
        edtheightft=findViewById(R.id.edtheightft);
        edtheightin=findViewById(R.id.edtheightin);
        btnCalculate=findViewById(R.id.btnCalculate);
        txtresult=findViewById(R.id.txtresult);
        llmain=findViewById(R.id.llmain);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             int wt =Integer.parseInt(edtweight.getText().toString());
            int ft =Integer.parseInt(edtheightft.getText().toString());
            int in =Integer.parseInt(edtheightin.getText().toString());

            int totalIn=ft*12 +in;
            double totalCm= totalIn*2.53;
            double totalM= totalCm/100;
            double bmi=wt/(totalM*totalM);
            if (bmi>25){
                txtresult.setText("You Are OverWeight");
                llmain.setBackgroundColor(getResources().getColor(R.color.colourow));
            }
            else if(bmi<18){
                txtresult.setText("You Are UnderWeight");
                llmain.setBackgroundColor(getResources().getColor(R.color.colouruw));
            }
            else
            {
                txtresult.setText("You Are Healthy");
                llmain.setBackgroundColor(getResources().getColor(R.color.colourhlt));
            }
            }
        });
    }
}