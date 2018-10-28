package com.example.grimyellow.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import static numericalOperations.Addition.AdditionDoubleValues;
import static numericalOperations.Multiplication.DoubleValues;



public class MainActivity extends AppCompatActivity
{
private TextView FirstValue;
private TextView Symbols;
private TextView SecondValue;
private Button BtnPlus;
private Button BtnMin;
private Button BtnSub;
private Button BtnDiv;
private Button Btn1;
private Button Btn2;
private Button Btn3;
private Button Btn4;
private Button Btn5;
private Button Btn6;
private Button Btn7;
private Button Btn8;
private Button Btn9;
private Button Btn0;
private Button Clear;
private double val1 = Double.NaN;
private double val2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        setupUIViews();
        Btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstValue.setText(FirstValue.getText().toString() + "0");
            }
        });
        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstValue.setText(FirstValue.getText().toString() + "1");
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstValue.setText(FirstValue.getText().toString() + "2");
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstValue.setText(FirstValue.getText().toString() + "3");
            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstValue.setText(FirstValue.getText().toString() + "4");
            }
        });
        Btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstValue.setText(FirstValue.getText().toString() + "5");
            }
        });
        Btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstValue.setText(FirstValue.getText().toString() + "6");
            }
        });
        Btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstValue.setText(FirstValue.getText().toString() + "7");
            }
        });
        Btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstValue.setText(FirstValue.getText().toString() + "8");
            }
        });
        Btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstValue.setText(FirstValue.getText().toString() + "9");
            }
        });
        BtnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                SecondValue.setText(String.valueOf(val1));
                Symbols.setText("+");
                FirstValue.setText(null);
            }
        });
        BtnMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                SecondValue.setText(String.valueOf(val1));
                Symbols.setText("-");
                FirstValue.setText(null);
            }
        });
        BtnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
               SecondValue.setText(String.valueOf(val1));
                Symbols.setText("*");
                FirstValue.setText(null);
            }
        });
        BtnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                SecondValue.setText(String.valueOf(val1));
                Symbols.setText("/");
                FirstValue.setText(null);
            }
        });
        Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(FirstValue.getText().length()>0){
                    CharSequence name = FirstValue.getText().toString();
                    FirstValue.setText(name.subSequence(0,name.length()-1));
                }
                else{
                 FirstValue.setText(null);
                 SecondValue.setText(null);
                }
            }
        });
       
    }
        private void setupUIViews() {
        Btn1=(Button) findViewById(R.id.Btn1);
        Btn2=(Button) findViewById(R.id.Btn2);
        Btn3=(Button) findViewById(R.id.Btn3);
        Btn4=(Button) findViewById(R.id.Btn4);
        Btn5=(Button) findViewById(R.id.Btn5);
        Btn6=(Button) findViewById(R.id.Btn6);
        Btn7=(Button) findViewById(R.id.Btn7);
        Btn8=(Button) findViewById(R.id.Btn8);
        Btn9=(Button) findViewById(R.id.Btn9);
        Btn0=(Button) findViewById(R.id.Btn0);
        BtnPlus=(Button) findViewById(R.id.BtnPlus);
        BtnMin=(Button) findViewById(R.id.BtnMin);
        BtnSub=(Button) findViewById(R.id.BtnSub);
        BtnDiv=(Button) findViewById(R.id.BtnDiv);
        FirstValue = (TextView)findViewById(R.id.FirstValue);
        Symbols=(TextView)findViewById(R.id.Symbols) ;
        SecondValue = (TextView)findViewById(R.id.SecondValue);
        Clear = (Button) findViewById(R.id.BtnC);
    }
     private void compute(){
        if(!Double.isNaN(val1)){
            val2=Double.parseDouble(FirstValue.getText().toString());
        }
        else{
            val1=Double.parseDouble(FirstValue.getText().toString());
        }
    }

    //Diavaste to readMeAddition gia to addition etc
}
