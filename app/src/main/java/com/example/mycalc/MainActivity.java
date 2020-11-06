package com.example.mycalc;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, button10, buttonC, buttonEqual,buttonDel;
    EditText calcEditText;

    float mValueOne, mValueTwo;

    boolean calcAddition, calcSubtract, calcMultiplication, calcDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        buttonAdd = findViewById(R.id.buttonadd);
        buttonSub = findViewById(R.id.buttonsub);
        buttonMul = findViewById(R.id.buttonmul);
        buttonDivision = findViewById(R.id.buttondiv);
        buttonC = findViewById(R.id.buttonC);
        buttonEqual = findViewById(R.id.buttoneql);
        buttonDel=findViewById(R.id.buttondel);
        calcEditText = findViewById(R.id.edt1);


        button1.setOnClickListener(v -> calcEditText.setText(String.format("%s1", calcEditText.getText())));

        button2.setOnClickListener(v -> calcEditText.setText(String.format("%s2", calcEditText.getText())));

        button3.setOnClickListener(v -> calcEditText.setText(String.format("%s3", calcEditText.getText())));

        button4.setOnClickListener(v -> calcEditText.setText(String.format("%s4", calcEditText.getText())));

        button5.setOnClickListener(v -> calcEditText.setText(String.format("%s5", calcEditText.getText())));

        button6.setOnClickListener(v -> calcEditText.setText(String.format("%s6", calcEditText.getText())));

        button7.setOnClickListener(v -> calcEditText.setText(String.format("%s7", calcEditText.getText())));

        button8.setOnClickListener(v -> calcEditText.setText(String.format("%s8", calcEditText.getText())));

        button9.setOnClickListener(v -> calcEditText.setText(String.format("%s9", calcEditText.getText())));

        button0.setOnClickListener(v -> calcEditText.setText(String.format("%s0", calcEditText.getText())));

        buttonAdd.setOnClickListener(v -> {
            try {
                mValueOne = Float.parseFloat(String.valueOf(calcEditText.getText()));
                calcAddition = true;
                calcEditText.setText(null);
            }
            catch (Exception e){
                e.printStackTrace();
            }

        });


        buttonSub.setOnClickListener(v -> {
            try {
                mValueOne = Float.parseFloat(String.valueOf(calcEditText.getText()));
                calcSubtract = true;
                calcEditText.setText(null);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        });

        buttonMul.setOnClickListener(v -> {
            try {
                mValueOne = Float.parseFloat(String.valueOf(calcEditText.getText()));
                calcMultiplication = true;
                calcEditText.setText(null);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        });

        buttonDivision.setOnClickListener(v -> {
            try {
                mValueOne = Float.parseFloat(String.valueOf(calcEditText.getText()));
                calcDivision = true;
                calcEditText.setText(null);
            }
            catch (Exception e){
                    e.printStackTrace();
            }
        });

        buttonEqual.setOnClickListener(v -> {
            try {
                mValueTwo = Float.parseFloat(String.valueOf(calcEditText.getText()));

                if (calcAddition) {
                    calcEditText.setText(String.format("%s", mValueOne + mValueTwo));
                    calcAddition = false;
                }

                if (calcSubtract) {
                    calcEditText.setText(String.format("%s", mValueOne - mValueTwo));
                    calcSubtract = false;
                }

                if (calcMultiplication) {
                    calcEditText.setText(String.format("%s", mValueOne * mValueTwo));
                    calcMultiplication = false;
                }

                if (calcDivision) {
                    calcEditText.setText(String.format("%s", mValueOne / mValueTwo));
                    calcDivision = false;
                }
            }
            catch (Exception e){
                e.printStackTrace();
            }
        });

        buttonC.setOnClickListener(v -> {
            mValueTwo=0;
            mValueOne=0;
            calcSubtract=false;
            calcMultiplication=false;
            calcDivision=false;
            calcAddition=false;
            calcEditText.setText(null);
        });
        buttonDel.setOnClickListener(v -> calcEditText.setText(null));
        button10.setOnClickListener(v -> calcEditText.setText(String.format("%s.", calcEditText.getText())));


    }
}