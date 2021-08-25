package com.example.minicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    Button add,subtract,multiplication,division;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        add=findViewById(R.id.add);
        subtract=findViewById(R.id.subtract);
        multiplication=findViewById(R.id.multiplication);
        division=findViewById(R.id.division);
        tv=findViewById(R.id.tv);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f,s,a;
                f=Integer.parseInt(et1.getText().toString());
                s=Integer.parseInt(et2.getText().toString());
                a=s+f;
                tv.setText("Result=" +a);
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f, s, a;
                f = Integer.parseInt(et1.getText().toString());
                s = Integer.parseInt(et2.getText().toString());
                a = s - f;
                tv.setText("Result=" + a);
            }
        });

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f,s,a;
                f=Integer.parseInt(et1.getText().toString());
                s=Integer.parseInt(et2.getText().toString());
                a=s*f;
                tv.setText("Result=" +a);
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f,s,a;
                f=Integer.parseInt(et1.getText().toString());
                s=Integer.parseInt(et2.getText().toString());
                a=s/f;
                tv.setText("Result=" +a);
            }
        });

    }

    }
