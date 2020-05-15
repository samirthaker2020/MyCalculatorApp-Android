package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText editResult;
Button btnEqual;
Button btn1;
Button btn2;
Button btn3;
Button btn4;
Button btn5;
Button btn6;
Button btn7;
Button btn8;
Button btn9;
Button btn0;
Button btnPoint;
Button btnMultiply;
Button btnSubtract;
Button btnAdd;
Button btnDivide;
float value1,value2;
boolean add,subtract,multiply,divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        btnEqual=(Button) findViewById(R.id.btnEqual);
        btn0=(Button) findViewById(R.id.btn0);
        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);
        btn3=(Button) findViewById(R.id.btn3);
        btn4=(Button) findViewById(R.id.btn4);
        btn5=(Button) findViewById(R.id.btn5);
        btn6=(Button) findViewById(R.id.btn6);
        btn7=(Button) findViewById(R.id.btn7);
        btn8=(Button) findViewById(R.id.btn8);
        btn9=(Button) findViewById(R.id.btn9);
        btnPoint=(Button) findViewById(R.id.btnPoint);
        btnAdd=(Button) findViewById(R.id.btnAdd);
        btnSubtract=(Button) findViewById(R.id.btnSubtract);
        btnMultiply=(Button) findViewById(R.id.btnMultiply);
        btnDivide=(Button) findViewById(R.id.btnDivide);


        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    
}
