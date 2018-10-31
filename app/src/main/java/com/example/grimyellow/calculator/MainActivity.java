package com.example.grimyellow.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import numericalOperations.MathResult;


public class MainActivity extends AppCompatActivity {
    private String set;
    private TextView tvOperator;
    private TextView tvResult;
    private String passedValue1="";
    private String passedValue2="";
    private String passedOperator="";
    private TextView FirstValue;
    private TextView SecondValue;
    private double result;
    private Button Clear;
    private double val1 = Double.NaN;
    private double val2=0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUIViews();




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
                    tvOperator.setText(null);
                    tvResult.setText(null);
                }
            }
        });

        tvResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showEqual(v);
            }

        });



    }

    private void setupUIViews()
    {


        FirstValue = (TextView)findViewById(R.id.FirstValue);
        SecondValue = (TextView)findViewById(R.id.SecondValue);
        Clear = (Button) findViewById(R.id.BtnC);
        tvResult = (TextView) findViewById(R.id.Result);
        tvOperator = (TextView) findViewById(R.id.Symbols);



    }


    public void showEqual(View v){

        passedValue1 = FirstValue.getText().toString();
        passedValue2 = SecondValue.getText().toString();
        passedOperator = tvOperator.getText().toString();
        result = MathResult.printResult(passedValue1, passedValue2, passedOperator);
        String finalResult= new Double (result).toString();
        tvResult.setText(finalResult);
        System.out.println(passedValue1);
        System.out.println(passedValue2);
        System.out.println(passedOperator);
    }

    public void btn(View v)
    {
        Button button = (Button) v;
        if(tvOperator.getText()=="")
        {
            FirstValue.append(button.getText());
        }
        else
        {
            SecondValue.append(button.getText());
        }
    }
    public void btnAddClic(View v)
    {
        set="plus";
        tvOperator.setText("+");
    }
    public void btnMinusClic(View v)
    {
        set="minus";
        tvOperator.setText("-");
    }
    public void btnDivClic(View v)
    {
        set="div";
        tvOperator.setText("/");
    }
    public void btnMultClic(View v)
    {
        set="mult";
        tvOperator.setText("*");
    }
}