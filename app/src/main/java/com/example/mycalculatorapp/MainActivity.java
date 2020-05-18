package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // variable declaration
TextView editResult;
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
        // hiding action bar
        getSupportActionBar().hide();

        // fetching the button Ids
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
        editResult=(TextView) findViewById(R.id.editText_Result);

        // button 0 click listener
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editResult.setText(editResult.getText()+"0");
            }
        });
        // button 1 click listener
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editResult.setText(editResult.getText()+"1");
            }
        });
        // button 2 click listener
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editResult.setText(editResult.getText()+"2");
            }
        });
        // button 3 click listener
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editResult.setText(editResult.getText()+"3");
            }
        });
        // button 4 click listener
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editResult.setText(editResult.getText()+"4");
            }
        });
        // button 5 click listener
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editResult.setText(editResult.getText()+"5");
            }
        });
        // button 6 click listener
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editResult.setText(editResult.getText()+"6");
            }
        });
        // button 7 click listener
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editResult.setText(editResult.getText()+"7");
            }
        });
        // button 8 click listener
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editResult.setText(editResult.getText()+"8");
            }
        });
        // button 9 click listener
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editResult.setText(editResult.getText()+"9");
            }
        });
        // button add click listener
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editResult.setText(editResult.getText()+"+");
            }
        });
        // button subtract click listener
        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editResult.setText(editResult.getText()+"-");
            }
        });
        // button multiply click listener
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editResult.setText(editResult.getText()+"*");
            }
        });
        // button divide click listener
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editResult.setText(editResult.getText()+"/");
            }
        });
        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editResult.setText(editResult.getText()+".");
            }
        });
        // button equal click listener
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


}
